package com.example.bollyfilmes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmesAdapter(private val filmeList: List<ItemFilme>) : RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder>() {

    companion object{
        const val VIEW_TYPE_DESTAQUE = 0
        const val VIEW_TYPE_ITEM = 1
    }

    class FilmesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitleTextView: TextView = itemView.findViewById(R.id.itemTitleTextView)
        val itemDescriptionTextView: TextView = itemView.findViewById(R.id.itemDescriptionTextView)
        val itemDateTextView: TextView = itemView.findViewById(R.id.itemDateTextView)
        val itemAvaliationRatinBar: RatingBar = itemView.findViewById(R.id.itemAvaliationRatinBar)

    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent, false)
        return FilmesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FilmesViewHolder, position: Int) {
        val currentItem = filmeList[position]

        holder.itemTitleTextView.text = currentItem.title
        holder.itemDescriptionTextView.text = currentItem.description
        holder.itemDateTextView.text = currentItem.releaseDate
        holder.itemAvaliationRatinBar.rating = currentItem.avaliation.toFloat()
    }

    override fun getItemCount(): Int = filmeList.size

    override fun getItemViewType(position: Int): Int {
        val type = when (position) {
            0 -> VIEW_TYPE_DESTAQUE
            else -> VIEW_TYPE_ITEM
        }
        return type
    }

}