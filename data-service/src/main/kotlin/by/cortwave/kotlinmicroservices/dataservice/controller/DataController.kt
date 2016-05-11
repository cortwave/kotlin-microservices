package by.cortwave.kotlinmicroservices.dataservice.controller

import by.cortwave.kotlinmicroservices.dataservice.service.DataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * @author Dmitry Pranchuk
 * @since 5/1/16.
 */
@RestController
@RequestMapping(value = "/data")
class DataController {

    @Autowired
    lateinit var dataService: DataService

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun getAll() = dataService.getAll()

}