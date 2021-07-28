package com.fcinar.rentacar.model

import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
data class Customer(
    @Id
    val id: UUID,
    val name: String,
    val surname: String,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL], mappedBy = "customer")
    val cars: List<Car>?
) {
    constructor(name: String, surname: String) : this(
        id = UUID.randomUUID(),
        name = name,
        surname = surname,
        cars = null
    )
}
