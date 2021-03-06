package com.thoughtworks.china.mobile.optional

data class Address(var street: String, var postcode: String?)
data class Company(var name: String, var address: Address?)
data class User(var name: String, var company: Company?)

class DeveloperKT(var firstName: String, var lastName: String) {
    var home: String? = null
    lateinit var company: String
    val fullName: String by lazy { "$lastName $firstName" }

    fun setup() {
        company = "ThoughtWorks"
    }
}

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val dev: DeveloperKT = DeveloperKT("Shuai", "Zhang")
        println("${dev.lastName} ${dev.firstName}'s home is: ${dev.home ?: "New House"}, length: ${dev.home?.length}")
        when {
            dev.home.equals(null) -> dev.home = "New House"
        }
        println("${dev.fullName}'s home is: ${dev.home}, length: ${dev.home!!.length}")
        dev.setup()
        println(dev.company)

        val user = User("Zhang Shuai", null)
        println(user.company?.address?.postcode)

    }

}