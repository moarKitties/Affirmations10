package com.example.affirmations10.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations10.DetailActivity
import com.example.affirmations10.R
import com.example.affirmations10.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView.setOnClickListener{
            val c = holder.imageView.context
            val intent = Intent(c, DetailActivity::class.java)

            intent.putExtra("test",context.resources.getString(item.stringResourceId))
            c.startActivity(intent)
        }

    }

    override fun getItemCount() = dataset.size
}