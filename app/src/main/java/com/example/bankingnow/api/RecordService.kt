package com.example.bankingnow.api

import com.example.bankingnow.model.GetBalanceModel
import com.example.bankingnow.model.BankRequestModel
import com.example.bankingnow.model.BankResponseModel
import com.example.bankingnow.model.NumberModel
import com.example.bankingnow.model.PasswordCheckRequest
import com.example.bankingnow.model.PasswordCheckResponse
import com.example.bankingnow.model.PostTestModel
import com.example.bankingnow.model.RecordModel
import com.example.bankingnow.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RecordService {
    @POST("/audio_test/")
    fun postTest(@Body postData: RecordModel): Call<NumberModel>

    @POST("/process_audio/")
    fun postNumber(@Body postData: RecordModel): Call<NumberModel>

    @POST("/accounts/check_password/")
    fun checkPassword(@Body request: PasswordCheckRequest): Call<PasswordCheckResponse>

    @GET("/money/check_balance/")
    fun getBalance():Call<GetBalanceModel>

    @POST("/post_bank/")
    fun postBank(@Body request: BankRequestModel):Call<BankResponseModel>

    @POST("/money/account-check/")
    fun postUserName(@Body request: UserRequestModel):Call<UserResponseModel>

    @POST("money/transfer/")
    fun remit(@Body request: RemitRequestModel):Call<RemitResponseModel>
}