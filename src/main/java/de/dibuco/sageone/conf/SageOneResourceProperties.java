package de.dibuco.sageone.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sageone.resource")
@Getter
@Setter
public class SageOneResourceProperties {
    private String uri;
}
