package pl.kamilszymanski707.cloudcore.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@PropertySources(
	PropertySource("classpath:git-config.properties"),
	PropertySource("classpath:application.yml"),
	PropertySource("classpath:bootstrap.yml"),
)
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
class ConfigApplication

fun main(args: Array<String>) {
	runApplication<ConfigApplication>(*args)
}
