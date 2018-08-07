package de.dibuco.sageone;

import com.fasterxml.jackson.databind.JsonNode;
import de.dibuco.sageone.conf.SageOneResourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @Autowired
    private OAuth2RestOperations restTemplate;

    @Autowired
    private SageOneResourceProperties resource;

    @RequestMapping("/")
    public JsonNode home() {
        return restTemplate.getForObject(resource.getUri(), JsonNode.class);
    }
}
