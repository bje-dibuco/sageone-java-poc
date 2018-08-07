package de.dibuco.sageone.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

@Configuration
public class SageOneConfiguration {

    @Bean
    public OAuth2RestOperations restTemplate(OAuth2ClientContext oauth2ClientContext) {
        return new OAuth2RestTemplate(sageoneProperties(), oauth2ClientContext);
    }

    @Bean
    @ConfigurationProperties("sageone.client")
    public AuthorizationCodeResourceDetails sageoneProperties() {
        return new AuthorizationCodeResourceDetails();
    }
}
