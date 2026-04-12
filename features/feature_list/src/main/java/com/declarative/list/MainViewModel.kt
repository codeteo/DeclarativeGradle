package com.declarative.list

import androidx.lifecycle.ViewModel
import com.declarative.common_domain.MovieRepository
import dev.zacsweers.metro.Inject
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
class MainViewModel @Inject constructor(
    repository: MovieRepository
) : ViewModel() {

    init {
        // TODO: replace GlobalScope with actual job handling and cancellation
        GlobalScope.launch {
            repository.getPopularMovies()
        }
    }

}