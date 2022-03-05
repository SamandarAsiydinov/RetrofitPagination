package uz.context.androidpagingnetwork.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.context.androidpagingnetwork.api.ApiService
import uz.context.androidpagingnetwork.paging.RickMortyPagingSource
import javax.inject.Inject

@HiltViewModel
class RickMortyViewModel @Inject constructor(
    private val apiService: ApiService
): ViewModel(){

    val listData = Pager(PagingConfig(pageSize = 1)) {
        RickMortyPagingSource(apiService)
    }.flow.cachedIn(viewModelScope)
}