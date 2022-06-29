package com.example.tmdbclientapp.presentation.di.tvshow

import com.example.tmdbclientapp.presentation.movie.MovieActivity
import com.example.tmdbclientapp.presentation.tvshow.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {

    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }
}