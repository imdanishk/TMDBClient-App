package com.example.tmdbclientapp.presentation.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tmdbclientapp.R
import com.example.tmdbclientapp.data.model.movie.Movie
import com.example.tmdbclientapp.databinding.ListItemBinding

class MovieAdapter(): RecyclerView.Adapter<MyViewHolder>() {

    private val movieList = ArrayList<Movie>()

    // To set values to ArrayList of Movies from the Activity
    fun setList(movies: List<Movie>) {
        movieList.clear()
        movieList.addAll(movies)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}

class MyViewHolder(private val binding: ListItemBinding):
    RecyclerView.ViewHolder(binding.root){

        fun bind(movie: Movie) {
            binding.tvTitle.text = movie.title
            binding.tvDescription.text = movie.overview
            val posterURL = "https://image.tmdb.org/t/p/w500"+movie.posterPath
            Glide.with(binding.ivImage.context)
                .load(posterURL)
                .into(binding.ivImage)

        }

}