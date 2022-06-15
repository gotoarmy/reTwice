package com.hallo.retwice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImagebigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagebig)
        val data=intent.getStringExtra("data")
        val imagedata = findViewById<ImageView>(R.id.imagedata)
        //Toast.makeText(this,data,Toast.LENGTH_LONG).show()
        //imamge.xml파일에서 data값마다 다른 화면을 보여주어야 한다.
        //문자열형식의 숫자를 보내줘야함
        if(data =="1")
        {
            imagedata.setImageResource(R.drawable.member_1)
        }
        if(data =="2")
        {
            imagedata.setImageResource(R.drawable.member_2)
        }
        if(data =="3")
        {
            imagedata.setImageResource(R.drawable.member_3)
        }
        if(data =="4")
        {
            imagedata.setImageResource(R.drawable.member_4)
        }
        if(data =="5")
        {
            imagedata.setImageResource(R.drawable.member_5)
        }
        if(data =="6")
        {
            imagedata.setImageResource(R.drawable.member_6)
        }
        if(data =="7")
        {
            imagedata.setImageResource(R.drawable.member_7)
        }
        if(data =="8")
        {
            imagedata.setImageResource(R.drawable.member_8)
        }
        if(data =="9")
        {
            imagedata.setImageResource(R.drawable.member_9)
        }

    }
}
