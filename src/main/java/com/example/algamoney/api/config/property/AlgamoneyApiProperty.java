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
    private final Mail mail = new Mail();

    @Getter
    private final S3 s3 = new S3();

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

    @Getter
    @Setter
    public static class Mail {
        private String host;
        private Integer port;
        private String username;
        private String password;
    }

    @Getter
    @Setter
    public static class S3 {
        private String accessKeyId;
        private String secretAccessKey;
        private String bucket = "aw-joceano-algamoney";
    }
}
