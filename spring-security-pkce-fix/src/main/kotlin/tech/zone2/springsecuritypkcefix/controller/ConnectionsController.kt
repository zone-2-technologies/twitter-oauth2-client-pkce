package tech.zone2.springsecuritypkcefix.controller

import mu.KotlinLogging
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger { }

@RestController
@RequestMapping("/connections")
class ConnectionsController {

    @GetMapping("/twitter")
    suspend fun connectTwitter(@RegisteredOAuth2AuthorizedClient("twitter") authorizedClient: OAuth2AuthorizedClient): String {
        logger.info { authorizedClient.accessToken.tokenValue }

        return "Twitter account connected"
    }

}
