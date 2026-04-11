package com.declarative.common_domain

import com.declarative.model.Movie
import com.declarative.model.Movies

interface MovieRepository {
    suspend fun getPopularMovies(): Movies

    suspend fun getNowPlaying(): Movies

    suspend fun getTopRated(): Movies

    suspend fun getUpcoming(): Movies

    suspend fun getMovieDetails(movieId: Int): Movie
}