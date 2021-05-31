import models.Resource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import services.ResourceService

@RestController
class Resources(val service: ResourceService) {

    @GetMapping
    fun get(): List<Resource> = service.getResources()

    @PostMapping
    fun post(@RequestBody resource: Resource) {
        service.storeResource(resource)
    }
}
