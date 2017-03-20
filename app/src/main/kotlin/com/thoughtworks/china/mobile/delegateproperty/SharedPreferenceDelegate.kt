package com.thoughtworks.china.mobile.delegateproperty

import android.content.SharedPreferences
import android.preference.PreferenceManager
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

inline fun <reified T : Number> sharedPreferenceDelegate(sharedPreferences: SharedPreferences, name: String, defaultValue: T = 0 as T) =
        SharedPreferenceDelegate(sharedPreferences, name, defaultValue, T::class)

@Suppress("IMPLICIT_CAST_TO_ANY", "UNCHECKED_CAST")
class SharedPreferenceDelegate<T: Number>(val sharedPreferences: SharedPreferences,
                                          val name: String,
                                          val defaultValue: T,
                                          val clazz: KClass<T>) : ReadWriteProperty<Any?, T> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return sharedPreferences.run {
            when (clazz) {
                Int::class -> getInt(name, defaultValue as Int)
                Long::class -> getLong(name, defaultValue as Long)
                Float::class -> getFloat(name, defaultValue as Float)
                else -> throw IllegalArgumentException("$clazz can be saved into SharedPreferences")
            }
        } as T
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        sharedPreferences.edit().apply {
            when (value) {
                is Int -> putInt(name, value)
                is Long -> putLong(name, value)
                is Float -> putFloat(name, value)
                else -> throw IllegalArgumentException("$value can be saved into SharedPreferences")
            }
        }.commit()
    }
}
/**
class Demo {
    var age: Int by sharedPreferenceDelegate(PreferenceManager.getDefaultSharedPreferences(context), "age")
    var height: Float by sharedPreferenceDelegate(PreferenceManager.getDefaultSharedPreferences(context), "height")
}
**/