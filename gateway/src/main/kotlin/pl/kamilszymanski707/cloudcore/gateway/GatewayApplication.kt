package pl.kamilszymanski707.cloudcore.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@PropertySources(
	PropertySource("classpath:gateway-allowed-routes.properties"),
	PropertySource("classpath:bootstrap.yml"),
)
@EnableEurekaClient
@SpringBootApplication
class GatewayApplication

fun main(args: Array<String>) {
	runApplication<GatewayApplication>(*args)
}
