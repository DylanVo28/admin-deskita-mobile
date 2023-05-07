package com.example.myapplication.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myapplication.R
import com.example.myapplication.entities.CartItem
import com.example.myapplication.entities.Discount
import com.example.myapplication.entities.DiscountItem
import com.squareup.picasso.Picasso

internal class DiscountViewHolder(private val row: View) {
    var txtNameDiscount: TextView
    var txtCategoryProduct: TextView
    var txtQuantity: TextView
    var txtValue: TextView
    var txtValidDate: TextView


    init {
        txtNameDiscount = row.findViewById(R.id.txtNameDiscount)
        txtCategoryProduct = row.findViewById(R.id.txtCategoryProduct)
        txtQuantity = row.findViewById(R.id.txtQuantity)
        txtValue = row.findViewById(R.id.txtValue)
        txtValidDate = row.findViewById(R.id.txtValidDate)

    }
}

class DiscountAdapter (var context: Context, var lvDiscount: ArrayList<DiscountItem>) : BaseAdapter(){
    var layoutInflater: LayoutInflater? = null

    override fun getCount(): Int {
        return lvDiscount.size
    }

    override fun getItem(position: Int): DiscountItem {
        return lvDiscount.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val viewHolder: DiscountViewHolder
        val view: View?
        if (convertView == null) {
            layoutInflater = LayoutInflater.from(context)
            view = layoutInflater!!.inflate(R.layout.discount_row, null)
            viewHolder = DiscountViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as DiscountViewHolder
        }
        viewHolder.txtNameDiscount.text = lvDiscount.get(position).name
        viewHolder.txtCategoryProduct.text = lvDiscount.get(position).categoryProduct
        viewHolder.txtQuantity.text ="" + lvDiscount.get(position).quantity
        viewHolder.txtValue.text ="" + lvDiscount.get(position).value
        viewHolder.txtValidDate.text ="" + lvDiscount.get(position).validDate


        return view as View
    }
}