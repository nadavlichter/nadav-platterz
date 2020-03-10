package platterz.services.restms.models

import javax.persistence.*

@Entity
data class RestaurantProduct (
        @Id
        @GeneratedValue(strategy = IDENTITY)
        val id: Int? = null,
        val item: String,
        val price: Double
)