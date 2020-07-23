package com.foodapp.test.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import com.foodapp.test.Fragment.*
import com.foodapp.test.R
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var naviView: BottomNavigationView
    lateinit var framelayout: FrameLayout
    var previousMenuItem: MenuItem? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        naviView = findViewById(R.id.navigationview)
        framelayout = findViewById(R.id.framelayoutmain)
        openOrder()
        naviView.setOnNavigationItemSelectedListener {
            if (previousMenuItem != null) {
                previousMenuItem?.isChecked = false
            }
                it.isCheckable = true
                it.isChecked = true
                previousMenuItem = it
                when (it.itemId) {
                    R.id.order -> {
                        openOrder()
                    }
                    R.id.goout -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.framelayoutmain, GooutFragment())
                            .commit()
                    }
                    R.id.gold -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.framelayoutmain, GoldFragment())
                            .commit()
                    }
                    R.id.explore -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.framelayoutmain, ExploreFragment())
                            .commit()
                    }
                    R.id.profile -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.framelayoutmain, ProfileFragment())
                            .commit()
                    }
            }

            return@setOnNavigationItemSelectedListener true
        }
    }


fun openOrder() {
    val fragment = OrderFragment()
    val trans = supportFragmentManager.beginTransaction()
    trans.replace(R.id.framelayoutmain, fragment)
    trans.commit()


}

override fun onBackPressed() {
    val frag = supportFragmentManager.findFragmentById(R.id.framelayoutmain)
    when (frag) {
        !is OrderFragment -> openOrder()

        else -> super.onBackPressed()
    }
}
}