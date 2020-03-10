package platterz.services.restms.dao

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import platterz.services.restms.models.Restaurant
import platterz.services.restms.repositories.RestaurantRepository

@Component
class RestaurantQuery : Query {

    @Autowired
    lateinit var restaurantRepository: RestaurantRepository

    fun restaurantQuery(id: Int): Restaurant? =
            restaurantRepository.findByIdOrNull(id)
}