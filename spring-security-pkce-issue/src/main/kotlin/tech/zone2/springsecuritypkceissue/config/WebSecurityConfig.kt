package tech.zone2.springsecuritypkceissue.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository
import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestCustomizers
import org.springframework.security.oauth2.client.web.server.DefaultServerOAuth2AuthorizationRequestResolver
import org.springframework.security.web.server.SecurityWebFilterChain


@EnableWebFluxSecurity
@Configuration
class WebSecurityConfig {

    @Bean
    fun configureResourceServer(http: ServerHttpSecurity): SecurityWebFilterChain = http
        .oauth2Client()
        .and()
        .authorizeExchange()
        .anyExchange().permitAll()
        .and()
        .build()


}
