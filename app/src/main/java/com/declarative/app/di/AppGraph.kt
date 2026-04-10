package com.declarative.app.di

import android.app.Application
import androidx.lifecycle.ViewModel
import com.declarative.app.BuildConfig
import com.declarative.app.BuildConfig.API_KEY
import com.declarative.common_data.MovieRepository
import com.declarative.common_data.MovieService
import com.declarative.common_data.MoviesRepositoryImpl
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Named
import dev.zacsweers.metro.Provider
import dev.zacsweers.metro.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Retrofit

@DependencyGraph(AppScope::class)
interface AppGraph {
    val repository: MovieRepository
    @Binds
    val MoviesRepositoryImpl.bind: MovieRepository

    @DependencyGraph.Factory
    fun interface Factory {
        fun create(@Provides application: Application): AppGraph
    }
}

@ContributesTo(AppScope::class)
interface NetworkGraph {

    @Provides
    @Named("api_key")
    fun providesApiKey(): String = API_KEY

    @Provides
    fun providesInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = Level.BODY
    }

    @Provides
    fun providesOkHttpClient(
        logger: HttpLoggingInterceptor
    ): okhttp3.OkHttpClient =
        okhttp3.OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()

    @Provides
    fun providesJson(): Json = Json { ignoreUnknownKeys = true }

    @Provides
    fun providesRetrofit(
        json: Json,
        okHttpClient: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .client(okHttpClient)
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()


    @Provides
    fun providesMovieService(
        retrofit: Retrofit
    ): MovieService = retrofit.create(MovieService::class.java)

}

@ContributesTo(AppScope::class)
interface ViewModeGraph {

    // TODO  empty for now

}