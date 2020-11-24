package com.jtmcompany.famousrestaurantapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.jtmcompany.famousrestaurantapp.adapter.LocationContentAdapter
import com.jtmcompany.famousrestaurantapp.R
import kotlinx.android.synthetic.main.fragment_seoul.*

class SeoulFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seoul, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list=ArrayList<String>()
        list.add("정")
        list.add("택")
        list.add("민")
        seoul_rv.adapter=
            LocationContentAdapter(
                list
            )
        seoul_rv.layoutManager=GridLayoutManager(context,3)

    }


}