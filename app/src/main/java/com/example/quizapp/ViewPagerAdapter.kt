package com.example.quizapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val context: Context, private val categories: List<Category>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageButton: ImageButton = view.findViewById(R.id.category_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = categories[position]
        holder.imageButton.setImageResource(category.drawableResId)
        holder.imageButton.background = ContextCompat.getDrawable(context, R.drawable.rounded_corners)
        holder.imageButton.contentDescription = category.name
        holder.imageButton.setOnClickListener {
            val intent = Intent(context, QuestionActivity::class.java)
            intent.putExtra("category", category.name)
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int = categories.size
}
