package com.example.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        var usertext = findViewById<EditText>(R.id.editTextTextPersonName)
        var button = findViewById<Button>(R.id.button)
        var myLayout = findViewById<ConstraintLayout>(R.id.clMain)
        val menues = arrayListOf<Any>()
        button.setOnClickListener {

            if (usertext.text.isEmpty()) {

                Snackbar.make(myLayout, "Sorry , you should enter something", Snackbar.LENGTH_LONG).show()
            } else {

                menues.add(usertext.text.toString());
                myRV.adapter = RecyclerViewAdapter(menues)
                myRV.layoutManager = LinearLayoutManager(this)
                usertext.text.clear()
            }
        }



    }
}


