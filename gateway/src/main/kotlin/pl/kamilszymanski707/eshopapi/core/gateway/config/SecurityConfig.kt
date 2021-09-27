package pl.kamilszymanski707.eshopapi.core.gateway.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@EnableWebFluxSecurity
internal class SecurityConfig(
    private val allowedRoutesConfig: AllowedRoutesConfig,
) {

    @Value("\${route-prefix}")
    private lateinit var routePrefix: String

    @Bean
    fun springSecurityFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain =
        http
            .csrf().disable()
            .authorizeExchange { aes ->
                allowedRoutesConfig.routes
                    .forEach {
                            aes
                                .pathMatchers(HttpMethod.valueOf(it.method), "${routePrefix}${it.id}/**")
                                .permitAll()
                    }

                aes
                    .anyExchange().authenticated()
            }
            .oauth2Client().and()
            .build()
}
