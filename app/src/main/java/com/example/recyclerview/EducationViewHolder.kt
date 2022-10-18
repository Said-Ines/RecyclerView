package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


 class EducationViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
    val pic : ImageView
    val startDate : TextView
    val endDate : TextView
    val compName : TextView
    val comAddress:TextView

    init {
        pic = itemView.findViewById(R.id.PicEduc)
        startDate= itemView.findViewById(R.id.StartDate)
        endDate= itemView.findViewById(R.id.EndDate)
        compName= itemView.findViewById(R.id.CompanyName)
        comAddress= itemView.findViewById(R.id.CompanyAddress)
    }
}