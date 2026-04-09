package com.declarative.common_data

import com.declarative.model.Movies
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.Named

class MoviesRepository @Inject constructor(
    private val moviesService: MovieService,
    @Named("api_key") private val API_KEY: String
) {

    suspend fun getPopularMovies(): Movies {
        return moviesService.fetchPopularMovies(API_KEY)
    }

    suspend fun getNowPlaying(): Movies {
        return moviesService.fetchNowPlaying(API_KEY)
    }

    suspend fun getTopRated(): Movies {
        return moviesService.fetchTopRatedMovies(API_KEY)
    }

    suspend fun getUpcoming(): Movies {
        return moviesService.fetchUpcomingMovies(API_KEY)
    }

}