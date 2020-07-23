package com.foodapp.test.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import com.foodapp.test.R


class OrderFragment : Fragment() {
lateinit var food: TextView
    lateinit var market:TextView
    lateinit var foodWork:TextView
    lateinit var self:TextView
    lateinit var frameLayout: FrameLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view=inflater.inflate(R.layout.fragment_order, container, false)
        food= view.findViewById(R.id.food)
        market =view.findViewById(R.id.market)
        foodWork=view.findViewById(R.id.foodwork)
        self=view.findViewById(R.id.selfpickup)
        frameLayout=view.findViewById((R.id.submenu))
       opensubmenu()
        market.setOnClickListener {
            Toast.makeText(activity as Context,"market clicked",Toast.LENGTH_SHORT).show()
        }

        food.setOnClickListener {
           opensubmenu()
            Toast.makeText(activity as Context,"market clicked",Toast.LENGTH_SHORT).show()
        }

        self.setOnClickListener {
            Toast.makeText(activity as Context,"selfpickup  clicked",Toast.LENGTH_SHORT).show()
        }

        foodWork.setOnClickListener {
            Toast.makeText(activity as Context,"food@work clicked",Toast.LENGTH_SHORT).show()
        }
        return view
    }

fun opensubmenu(){
    val fragment = submenu()
    childFragmentManager.beginTransaction().apply {
        add(R.id.subframe, fragment)
        commit()

    }
}
    }
