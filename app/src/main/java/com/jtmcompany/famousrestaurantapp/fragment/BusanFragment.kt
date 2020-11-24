package com.jtmcompany.famousrestaurantapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.jtmcompany.famousrestaurantapp.adapter.LocationContentAdapter
import com.jtmcompany.famousrestaurantapp.R
import kotlinx.android.synthetic.main.fragment_busan.*


class BusanFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_busan, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list=ArrayList<String>()
        list.add("테")
        list.add("스")
        list.add("트")
        busan_rv.adapter=
            LocationContentAdapter(
                list
            )
        busan_rv.layoutManager=GridLayoutManager(context,3)

    }

}