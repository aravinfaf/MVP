package com.kgisl.mvp.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.kgisl.mvp.R
import com.kgisl.mvp.model.Model

class RecyclerAdapter(val arrayList: ArrayList<Model>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val  li=LayoutInflater.from(parent.context).inflate(R.layout.adapter_layout,parent,false)
        return ViewHolder(li)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.nameTV.setText(arrayList.get(position).name)
        holder.cityTV.setText(arrayList.get(position).city)

        holder.nameTV.setOnClickListener(View.OnClickListener {
            Toast.makeText(it.context,arrayList.get(position).name,Toast.LENGTH_LONG).show()
        })
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val nameTV:TextView=itemView.findViewById(R.id.nameTV)
        val cityTV:TextView=itemView.findViewById(R.id.cityTV)

    }
}