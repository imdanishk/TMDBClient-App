package com.example.tmdbclientapp.presentation.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tmdbclientapp.R
import com.example.tmdbclientapp.data.model.artist.Artist
import com.example.tmdbclientapp.data.model.movie.Movie
import com.example.tmdbclientapp.databinding.ListItemBinding

class ArtistAdapter(): RecyclerView.Adapter<MyViewHolder>() {

    private val artistsList = ArrayList<Artist>()

    // To set values to ArrayList of Movies from the Activity
    fun setList(artists: List<Artist>) {
        artistsList.clear()
        artistsList.addAll(artists)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(artistsList[position])
    }

    override fun getItemCount(): Int {
        return artistsList.size
    }
}

class MyViewHolder(private val binding: ListItemBinding):
    RecyclerView.ViewHolder(binding.root){

        fun bind(artist: Artist) {
            binding.tvTitle.text = artist.name
            binding.tvDescription.text = artist.popularity.toString()
            val posterURL = "https://image.tmdb.org/t/p/w500"+artist.profilePath
            Glide.with(binding.ivImage.context)
                .load(posterURL)
                .into(binding.ivImage)
        }

}