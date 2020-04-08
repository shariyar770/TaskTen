package com.example.task10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val count: String =intent.getStringExtra("count")
        var ScrollView = ScrollView(this)
        setContentView(ScrollView)
        val linearLayout: LinearLayout = LinearLayout(this)
        linearLayout.orientation= LinearLayout.VERTICAL
        for(i in 0 until count.toInt()){
            val button = Button(this)
            button.text="Button ${i+1}"
            linearLayout.addView(button)
        }
        ScrollView.addView(linearLayout)

    }
}
