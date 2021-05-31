package services

import models.Resource
import org.springframework.stereotype.Service
import repositories.ResourceRepository

@Service
class ResourceService(val db: ResourceRepository) {

    fun getResources() : List<Resource> = db.getResources()

    fun storeResource(resource: Resource) {
        db.save(resource)
    }

}