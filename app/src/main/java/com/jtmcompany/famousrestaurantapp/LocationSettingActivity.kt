package com.jtmcompany.famousrestaurantapp

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.jtmcompany.famousrestaurantapp.adapter.LocationContentPagerAdapter
import kotlinx.android.synthetic.main.activity_location_setting.*

class LocationSettingActivity : AppCompatActivity(),
    TabLayout.OnTabSelectedListener {
    var vp:ViewPager? =null
    var tab:TabLayout? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_setting)
        vp=content_viewpager
        tab=layout_tab

        //탭 메뉴설정
        init()


        //다이얼로그 크기조정
        val display =getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val width=display.defaultDisplay.width*0.9
        val height=display.defaultDisplay.height*0.7
        window.attributes.width= width.toInt()
        window.attributes.height=height.toInt()


        var vpAdapter=
            LocationContentPagerAdapter(
                supportFragmentManager,
                layout_tab.tabCount
            )
        vp?.adapter=vpAdapter
        //탭레이아웃과 뷰페이저와연결
        vp?.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab))

        //탭레이아웃 클릭 이벤트 설정
        tab?.addOnTabSelectedListener(this)

   }



    override fun onTabReselected(tab: TabLayout.Tab?) {}

    override fun onTabUnselected(tab: TabLayout.Tab?) {}

    override fun onTabSelected(tab: TabLayout.Tab?) {
        if (tab != null) {
            vp?.setCurrentItem(tab.position)
        }
    }

    fun init(){
        tab?.addTab(layout_tab.newTab().setText("서울특별시"))
        tab?.addTab(layout_tab.newTab().setText("부산광역시"))
        tab?.addTab(layout_tab.newTab().setText("대구광역시"))
        tab?.addTab(layout_tab.newTab().setText("인천광역시"))
        tab?.addTab(layout_tab.newTab().setText("광주광역시"))
        tab?.addTab(layout_tab.newTab().setText("대전광역시"))
        tab?.addTab(layout_tab.newTab().setText("울산광역시"))
        tab?.addTab(layout_tab.newTab().setText("경기도"))
        tab?.addTab(layout_tab.newTab().setText("강원도"))
        tab?.addTab(layout_tab.newTab().setText("충청북도"))
        tab?.addTab(layout_tab.newTab().setText("충청남도"))
        tab?.addTab(layout_tab.newTab().setText("전라북도"))
        tab?.addTab(layout_tab.newTab().setText("전라남도"))
        tab?.addTab(layout_tab.newTab().setText("경상북도"))
        tab?.addTab(layout_tab.newTab().setText("경상남도"))
        tab?.addTab(layout_tab.newTab().setText("제주특별자치도"))
    }



}