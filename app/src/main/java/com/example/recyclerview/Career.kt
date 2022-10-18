package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class Career : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.career)

        //calling the action bar
        var actionBar = supportActionBar


        if(actionBar != null){
            //Customize the arrow button
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)

            // Showing the arrow button in action bar
            actionBar.setDisplayHomeAsUpEnabled(true)
        }




    }
}