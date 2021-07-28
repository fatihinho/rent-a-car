package com.fcinar.rentacar.model

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
data class Car(
    @Id
    val id: UUID,
    val name: String,
    val model: String,
    val rentingHour: Int?,
    val amountPerHour: BigDecimal,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer_id", nullable = true)
    val customer: Customer?
) {
    constructor(name: String, model: String, amountPerHour: BigDecimal) : this(
        id = UUID.randomUUID(),
        name = name,
        model = model,
        rentingHour = null,
        amountPerHour = amountPerHour,
        customer = null
    )
}
