package com.example.nestedrcvkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParentAdapter(private val parentList: List<ParentItem>) : RecyclerView.Adapter<ParentAdapter.ParentViewHolder>(){

    inner class ParentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val logoIv : ImageView = itemView.findViewById(R.id.parentLogoIv)
        val titleTv : TextView = itemView.findViewById(R.id.parentTitleTv)
        val childRcv : RecyclerView = itemView.findViewById(R.id.langRCV)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return ParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val parentItem = parentList[position]
        holder.logoIv.setImageResource(parentItem.logo)
        holder.titleTv.text = parentItem.title

        holder.childRcv.setHasFixedSize(true)
        holder.childRcv.layoutManager = GridLayoutManager(holder.itemView.context , 3)

        val adapter = ChildAdapter(parentItem.mList)
        holder.childRcv.adapter = adapter
    }

    override fun getItemCount(): Int {
       return parentList.size
    }
}