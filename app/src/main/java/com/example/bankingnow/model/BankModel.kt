package com.example.bankingnow.model

data class BankRequestModel(
    val voice_bank :String
)
data class BankResponseModel(
    val closest_bank :String
)