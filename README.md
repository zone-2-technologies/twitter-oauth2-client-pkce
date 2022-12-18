# spring-security OAuth2 client PKCE issue

Twitter expects an OAuth2 flow with PKCE. The only way to enable it is to extend the spring-security configuration.

`spring-security` allows to set PKCE in [oauth2Login](https://github.com/spring-projects/spring-security/pull/7804), but for our specific use case a login is not required.

* `spring-security-pkce-issue` contains the code that is currently not operational.
* `spring-security-pkce-fix` contains the code that includes a fixed `spring-security-configuration` jar. Code is available at: https://github.com/spoptchev/spring-security/tree/authorization-resolver-oauth2-client

To run the projects you will need a Twitter OAuth2 application with `ClientId` and `ClientSecret`. The redirect uri should be set to `http://localhost:8080/connections/twitter`. You have to export the `ClientId` to `TWITTER_CLIENT_ID` and the `ClientSecret` to `TWITTER_CLIENT_SECRET` before running one of the projects. Then browse to `http://localhost:8080/connections/twitter` to initiate the OAuth2 flow.
