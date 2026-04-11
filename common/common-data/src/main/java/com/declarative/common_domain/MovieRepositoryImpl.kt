package com.declarative.common_domain

import com.declarative.model.Movie
import com.declarative.model.Movies
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.Named
import dev.zacsweers.metro.SingleIn

@SingleIn(AppScope::class)
class MoviesRepositoryImpl @Inject constructor(
    private val moviesService: MovieService,
    @Named("api_key") private val API_KEY: String
): MovieRepository {

    override suspend fun getPopularMovies(): Movies {
        return moviesService.fetchPopularMovies(API_KEY)
    }

    override suspend fun getNowPlaying(): Movies {
        return moviesService.fetchNowPlaying(API_KEY)
    }

    override suspend fun getTopRated(): Movies {
        return moviesService.fetchTopRatedMovies(API_KEY)
    }

    override suspend fun getUpcoming(): Movies {
        return moviesService.fetchUpcomingMovies(API_KEY)
    }

    override suspend fun getMovieDetails(movieId: Int): Movie {
        return moviesService.fetchMovieDetails(API_KEY, movieId)
    }

}