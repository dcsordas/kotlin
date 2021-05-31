package repositories

import models.Resource
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ResourceRepository: CrudRepository<Resource, String> {

	@Query("SELECT * FROM resources")
	fun getResources() : List<Resource>

}