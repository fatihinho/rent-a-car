package com.fcinar.rentacar.dto

import java.math.BigDecimal

data class CreateCarRequest(
    val name: String,
    val model: String,
    val amountPerHour: BigDecimal
)
