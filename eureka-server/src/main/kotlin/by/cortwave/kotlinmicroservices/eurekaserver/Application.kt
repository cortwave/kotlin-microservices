package by.cortwave.kotlinmicroservices.eurekaserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * @author Dmitry Pranchuk
 * @since 5/1/16.
 */
@SpringBootApplication
@EnableEurekaServer
open class Application {
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java)
}