package com.example.task10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var linearLayout: LinearLayout= LinearLayout(this)
        linearLayout.orientation=LinearLayout.VERTICAL
        setContentView(linearLayout)
        var editText=EditText(this)
        var button=Button(this)
        linearLayout.addView(editText)
        linearLayout.addView(button)
        button.text="Next"
        editText.hint="Please Enter count of buttons"

        button.setOnClickListener{
            if(editText.text.toString().isNotEmpty()){
              val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("count",editText.text.toString())
                startActivity(intent)
            }
        }
    }
}
