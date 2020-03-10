package platterz.services.restms.models

import org.springframework.cglib.core.internal.LoadingCache.IDENTITY
import javax.persistence.*


@Entity
data class Restaurant (
        @Id
        @GeneratedValue(strategy = IDENTITY)
        val id: Int? = null,
        val name: String,
        val description: String,
        val priceRange: Int,

        val imageSrc: String,
        val imageDescription: String,

        @OneToMany(targetEntity = RestaurantProduct::class, cascade = [ CascadeType.ALL ])
        val menu: List<RestaurantProduct>
)