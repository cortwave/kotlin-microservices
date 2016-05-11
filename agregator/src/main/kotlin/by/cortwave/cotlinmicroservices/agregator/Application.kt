package by.cortwave.cotlinmicroservices.agregator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

/**
 * @author Dmitry Pranchuk
 * @since 5/11/16.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EnableFeignClients
open class Application {
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}