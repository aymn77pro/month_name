package com.example.month_name.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.month_name.R
import com.example.month_name.model.month

class ItemAdapter(private val context : Context ,private val datset: List<month>):RecyclerView.Adapter<ItemAdapter.ItmeViewHolder>() {
    class ItmeViewHolder(private val view : View):RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItmeViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ItmeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItmeViewHolder, position: Int) {
        val itme = datset[position]
        holder.textView.text = context.resources.getString(itme.stringReasourceId)
    }

    override fun getItemCount(): Int {
        return datset.size
    }

}