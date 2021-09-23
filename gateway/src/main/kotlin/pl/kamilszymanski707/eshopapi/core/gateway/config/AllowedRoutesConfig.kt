package pl.kamilszymanski707.eshopapi.core.gateway.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "gateway-allowed-routes")
internal class AllowedRoutesConfig {

    var routes: List<AllowedRouteConfig> = listOf()
}

internal class AllowedRouteConfig {

    var id: String = ""
    var method: String = ""
    var roles: Array<String> = arrayOf()
}
