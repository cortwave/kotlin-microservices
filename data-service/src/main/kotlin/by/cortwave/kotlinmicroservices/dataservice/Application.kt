package by.cortwave.kotlinmicroservices.dataservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * @author Dmitry Pranchuk
 * @since 5/11/16.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
open class Application {
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}