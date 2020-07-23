package com.foodapp.test.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.test.R
import com.foodapp.test.model.Food3

class Adapter3(val context: Context,val itemlist:ArrayList<Food3>): RecyclerView.Adapter<Adapter3.Adapter3ViewHolder>() {
    class Adapter3ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val img:ImageView=view.findViewById(R.id.rimg)
        val rname:TextView=view.findViewById(R.id.rname)
        val add:TextView=view.findViewById(R.id.raddres)
        val price:TextView=view.findViewById(R.id.rprice)
        val timetodeliver:TextView=view.findViewById(R.id.ttd)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter3ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item3,parent,false)
        return Adapter3ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: Adapter3ViewHolder, position: Int) {
        val list=itemlist[position]
        holder.img.setImageResource(list.img)
        holder.rname.text=list.rname
        holder.add.text=list.raddress
        holder.price.text=list.price
        holder.timetodeliver.text=list.time
    }
}