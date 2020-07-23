package com.foodapp.test.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.foodapp.test.R
import com.foodapp.test.model.Food1
import com.foodapp.test.model.Food3
import com.foodapp.test.adapter.Adapter1
import com.foodapp.test.adapter.Adapter3

class submenu : Fragment() {

    lateinit var recycler1: RecyclerView

    lateinit var recycler3: RecyclerView
    lateinit var layoutmanager1: RecyclerView.LayoutManager
    lateinit var layoutmanaer2: RecyclerView.LayoutManager
    lateinit var recyclerAdapter1:Adapter1

    lateinit var recyclerAdapter3: Adapter3
    val restaurentlist= arrayListOf<Food3>(
        Food3(R.drawable.cake,"name1","4.5","address1","300 per person","54min"),
        Food3(R.drawable.pizza,"name2","4.0","address2","200 per person","54min"),
            Food3(R.drawable.chole,"name3","4.35","address3","250 per person","54min"),
            Food3(R.drawable.cake,"name4","4.1","address4","100 per person","54min"),
            Food3(R.drawable.cake,"name5","4.2","address5","200 per person","54min"),
            Food3(R.drawable.cake,"name6","4.3","address6","400 per person","54min"),
            Food3(R.drawable.cake,"name7","4.4","address7","500 per person","54min")



    )
    val foodlist1 = arrayListOf<Food1>(
        Food1(R.drawable.paratha,"Paratha"),
        Food1(R.drawable.pizza,"pizza"),
        Food1(R.drawable.sandwich,"Sandwich"),
        Food1(R.drawable.roll,"Rolls"),
        Food1(R.drawable.chaat,"Chaat"),
        Food1(R.drawable.dosa,"Dosa"),
        Food1(R.drawable.chole,"Chole"),
        Food1(R.drawable.cake,"Cake")
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_submenu, container, false)

        recycler1 = view.findViewById(R.id.recycler1)

        recycler3 = view.findViewById(R.id.recycler3)
        layoutmanager1 = GridLayoutManager(activity as Context, 4)
        layoutmanaer2 = LinearLayoutManager(activity)
        recyclerAdapter1=Adapter1(activity as Context,foodlist1)
recycler1.adapter=recyclerAdapter1
        recycler1.layoutManager=layoutmanager1
        recyclerAdapter3=Adapter3(activity as Context,restaurentlist)
recycler3.adapter=recyclerAdapter3
        recycler3.layoutManager=layoutmanaer2
        return view


    }

}