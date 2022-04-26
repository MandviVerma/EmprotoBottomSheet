package com.example.emprotobottomsheet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(  private var mContext: Context?,
                      private var dataModel: ArrayList<DataModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notification_item, parent, false)
        return ViewHolder(view)
    }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.imageView.setImageResource(dataModel[position].image)
         holder.topic.text = dataModel[position].topic
        holder.desc.text = dataModel[position].desc
        holder.time.text = dataModel[position].time
     }

    override fun getItemCount(): Int {
        return dataModel.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivImage)
        val topic: TextView = itemView.findViewById(R.id.tvTopic)
        val desc: TextView = itemView.findViewById(R.id.tvMsg)
        val time: TextView = itemView.findViewById(R.id.tvTime)

    }
}
