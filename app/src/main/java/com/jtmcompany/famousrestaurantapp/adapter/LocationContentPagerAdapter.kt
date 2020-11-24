package com.jtmcompany.famousrestaurantapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.jtmcompany.famousrestaurantapp.fragment.BusanFragment
import com.jtmcompany.famousrestaurantapp.fragment.DaguFragment
import com.jtmcompany.famousrestaurantapp.fragment.SeoulFragment

class LocationContentPagerAdapter(fm: FragmentManager, pageCount:Int): FragmentStatePagerAdapter(fm,pageCount) {
    var fm=fm
    var pageCount=pageCount

    override fun getItem(position: Int): Fragment {
        return when(position){
            0->SeoulFragment()
            1->BusanFragment()
            2->DaguFragment()

            else -> {throw IllegalStateException("$position is illegal") }
        }


    }

    override fun getCount(): Int {
        return pageCount
    }

}