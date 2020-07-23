package com.foodapp.test.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.test.R
import com.foodapp.test.model.Food1

class Adapter1(val context: Context, val itemlist:ArrayList<Food1>): RecyclerView.Adapter<Adapter1.Adapter1ViewHolder>() {
    class Adapter1ViewHolder(view: View): RecyclerView.ViewHolder(view){
val imge:ImageView=view.findViewById(R.id.fImage)
        val name:TextView=view.findViewById(R.id.fname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter1ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item1,parent,false)
    return  Adapter1ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: Adapter1ViewHolder, position: Int) {
     val src=itemlist[position]
        holder.imge.setImageResource(src.fimg)
        holder.name.text=src.fname
    }
}