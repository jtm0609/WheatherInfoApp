package com.jtmcompany.famousrestaurantapp

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonParser

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.net.URLConnection


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val areaTop="청주시" //지역
        val areaMDL="서원구"
        val areaLeaf="사직동"

        Thread{
            //시 검색
            val url= URL("http://www.kma.go.kr/DFSROOT/POINT/DATA/top.json.txt");
            val conn=url.openConnection();
            val br=BufferedReader(InputStreamReader(conn.getInputStream()))
            val result=br.readLine().toString();
            br.close()
            val parser =JsonParser()
            val jArr=parser.parse(result)
            val gson=Gson()

            Log.d("tak", result)

        }.start()

    }
}