package pl.kamilszymanski707.eshopapi.core.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
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
class ConfigApplication : CommandLineRunner {

	@Value("\${git-root-search-path}")
	private lateinit var gitRootSearchPath: String

	private val log: Logger = LoggerFactory.getLogger(this::class.java)

	override fun run(vararg args: String?) {
		log.info("Loading properties from path: {} ...", gitRootSearchPath)
	}
}

fun main(args: Array<String>) {
	runApplication<ConfigApplication>(*args)
}
