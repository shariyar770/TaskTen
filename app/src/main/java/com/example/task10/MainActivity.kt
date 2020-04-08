package com.example.task10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var ScrollView = ScrollView(this)
        val linearLayout: LinearLayout=LinearLayout(this)
       linearLayout.orientation=LinearLayout.VERTICAL
        setContentView(linearLayout)
         setContentView(ScrollView)
        for(i in 0 until 50){
            val button = Button(this)
            button.text="Button ${i+1}"
            linearLayout.addView(button)
        }

        ScrollView.addView(linearLayout)


    }
}
