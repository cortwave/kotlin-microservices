package by.cortwave.kotlinmicroservices.zuulgateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

/**
 * @author Dmitry Pranchuk
 * @since 5/11/16.
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
open class Application {

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}