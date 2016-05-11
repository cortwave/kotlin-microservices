package by.cortwave.kotlinmicroservices.configserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer


/**
 * @author Dmitry Pranchuk
 * @since 5/11/16.
 */
@EnableConfigServer
@SpringBootApplication
open class Application {

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java)
}