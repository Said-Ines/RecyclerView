package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class Career : AppCompatActivity() {

    private lateinit var btnExperience:Button
    private lateinit var btnEducation:Button


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

        btnExperience=findViewById(R.id.experience)
        btnEducation=findViewById(R.id.education)

        btnExperience.setOnClickListener {
            changeFragment(experience_fragment(),"")

        }

        btnExperience.setOnClickListener {
            changeFragment(EducationFragment(),"")
        }
    }

    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }

    fun arrow(arrow: ImageButton){

    }
}