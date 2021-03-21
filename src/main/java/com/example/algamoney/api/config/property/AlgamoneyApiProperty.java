package com.example.algamoney.api.config.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProperty {

    @Getter
    private final Seguranca seguranca = new Seguranca();

    @Getter
    private final Origin origin = new Origin();

    @Getter
    @Setter
    public static class Seguranca {
        private boolean enableHttps;
    }

    @Getter
    @Setter
    public static class Origin {
        private String originPermitida = "http://localhost:4200";
    }
}
