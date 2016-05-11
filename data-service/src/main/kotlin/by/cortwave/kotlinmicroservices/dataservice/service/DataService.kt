package by.cortwave.kotlinmicroservices.dataservice.service

import org.springframework.stereotype.Service

/**
 * @author Dmitry Pranchuk
 * @since 5/1/16.
 */
@Service
class DataService {

    fun getAll(): Array<String> {
        println("call")
        return arrayOf("Hello", "from", "spring", "service", "now", System.currentTimeMillis().toString())
    }

}