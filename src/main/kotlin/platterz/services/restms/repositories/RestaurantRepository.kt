package platterz.services.restms.repositories

import platterz.services.restms.models.Restaurant
import org.springframework.stereotype.Repository
import org.springframework.data.repository.PagingAndSortingRepository

@Repository
interface RestaurantRepository : PagingAndSortingRepository<Restaurant, Int>