package de.dibuco.sageone;

import com.fasterxml.jackson.databind.JsonNode;
import de.dibuco.sageone.conf.SageOneResourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sage")
class SageDataController {

    @Autowired
    private OAuth2RestOperations restTemplate;

    @Autowired
    private SageOneResourceProperties resource;

    @RequestMapping(method = RequestMethod.GET, value = "/sales_invoices")
    public JsonNode getSalesInvoices() {
        return restTemplate.getForObject(resource.getUri() + "/accounts/v3/sales_invoices", JsonNode.class);
    }
}
