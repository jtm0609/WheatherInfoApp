package com.jtmcompany.famousrestaurantapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jtmcompany.famousrestaurantapp.R
import kotlinx.android.synthetic.main.location_content_item.view.*

class LocationContentAdapter(content:ArrayList<String>) : RecyclerView.Adapter<LocationContentAdapter.ContentViewHolder>(){
    val contentList= content
    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bt=itemView.content_item_bt

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val layoutInflater =LayoutInflater.from(parent.context).inflate(R.layout.location_content_item,parent,false)
        return ContentViewHolder(
            layoutInflater
        )
    }

    override fun getItemCount(): Int {
        return contentList.size
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        holder.bt.setText(contentList.get(position))
    }
}