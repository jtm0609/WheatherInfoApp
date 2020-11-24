package com.jtmcompany.famousrestaurantapp

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonParser
import kotlinx.android.synthetic.main.activity_main.*

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.net.URLConnection


class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val areaTop="서울특별시" //지역
        val areaMDL="서원구"
        val areaLeaf="사직동"
        var code:String

        Thread{
            //시 검색
            var url= URL("http://www.kma.go.kr/DFSROOT/POINT/DATA/top.json.txt");
            var conn=url.openConnection()
            var br=BufferedReader(InputStreamReader(conn.getInputStream()))
            var result=br.readLine().toString()
            br.close()
            val parser =JsonParser()
            val jArr=parser.parse(result).asJsonArray
            for(i in 0 until jArr.size()){
                var  jobj=jArr.get(i).asJsonObject
                if(jobj.get("value").asString == areaTop){
                    code=jobj.get("code").asString
                    Log.d("tak","code: "+ code)


                }



            }

            Log.d("tak", result)

            url =URL("http://www.kma.go.kr/DFSROOT/POINT/DATA/mdl.43.json.txt")
            conn=url.openConnection()
            br= BufferedReader(InputStreamReader(conn.getInputStream()))
            result=br.readLine().toString()
            br.close()
            Log.d("tak",result)



        }.start()

        settingLocation_bt.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val intent=Intent(this,LocationSettingActivity::class.java)
        startActivity(intent)

    }
}