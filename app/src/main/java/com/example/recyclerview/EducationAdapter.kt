package com.example.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EducationAdapter (val EducationList: MutableList<Education>): RecyclerView.Adapter<EducationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.education_item,parent,false)
        return EducationViewHolder(view)
    }
    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {

        val start_date = EducationList[position].StartDate
        val end_date = EducationList[position].EndDate
        val comp_name = EducationList[position].CompanyName
        val comp_address = EducationList[position].CompanyAddress


        holder.pic.setImageResource(EducationList[position].PicEduc)
        holder.startDate.text =start_date
        holder.endDate.text = end_date
        holder.compName.text=comp_name
        holder.comAddress.text=comp_address


        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, EducationFragment::class.java)
            intent.apply {

            }
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount() = EducationList.size
}