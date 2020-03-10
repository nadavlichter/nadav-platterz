package platterz.services.restms.dao

import com.expediagroup.graphql.spring.operations.Mutation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import platterz.services.restms.repositories.RestaurantRepository
import platterz.services.restms.models.Restaurant

@Component
class CreateRestaurantMutation : Mutation {

    @Autowired
    lateinit var restaurantRepository: RestaurantRepository

    fun createRestaurant(restaurant: Restaurant): Restaurant =
            restaurantRepository.save(restaurant)
}