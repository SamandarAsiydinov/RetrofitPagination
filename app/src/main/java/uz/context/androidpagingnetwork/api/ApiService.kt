package uz.context.androidpagingnetwork.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.context.androidpagingnetwork.models.ResponseApi
import uz.context.androidpagingnetwork.utils.Constants

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): Response<ResponseApi>
}