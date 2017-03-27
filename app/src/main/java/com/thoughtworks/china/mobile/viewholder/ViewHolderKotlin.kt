package com.thoughtworks.china.mobile.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.layout_item.view.*

class ViewHolderKotlin(itemView: View)
    : RecyclerView.ViewHolder(itemView) {
    fun populate() {
        itemView.imageView.setImageDrawable(null)
        itemView.textView.text = ""
        itemView.checkbox.isChecked = false
        itemView.editText.hint = ""
        itemView.button.setOnClickListener { }
    }
}