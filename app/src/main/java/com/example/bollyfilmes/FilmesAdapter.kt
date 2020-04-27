package com.example.bollyfilmes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_filme.view.*

class FilmesAdapter(private val filmeList: List<ItemFilme>) : RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder>() {

    class FilmesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        val cardViewLayout: CardView = itemView.findViewById(R.id.cardViewLayout)
//        val itemLayoutLinearLayout: LinearLayout = itemView.findViewById(R.id.itemLayoutLinearLayout)
//        val itemPosterImageView: ImageView = itemView.findViewById(R.id.itemPosterImageView)
//        val itemTextLinearLayout: LinearLayout = itemView.findViewById(R.id.itemTextLinearLayout)
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
        holder.itemAvaliationRatinBar.rating = currentItem.avaliation
    }

    override fun getItemCount(): Int = filmeList.size
}