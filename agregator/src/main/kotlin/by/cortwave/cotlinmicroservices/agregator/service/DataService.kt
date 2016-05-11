package by.cortwave.cotlinmicroservices.agregator.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * @author Dmitry Pranchuk
 * @since 5/11/16.
 */
@FeignClient("data-service")
interface DataService {

    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/data")
    fun getAll(): Array<String>

}