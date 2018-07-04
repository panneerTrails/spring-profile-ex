package com.spring.profile.trail.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("environment")
public class EnvConfig {

    private String name;
    private String host;

    public String getName() {
        return name;
    }

    public EnvConfig setName(String name) {
        this.name = name;
        return this;
    }

    public String getHost() {
        return host;
    }

    public EnvConfig setHost(String host) {
        this.host = host;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EnvConfig{");
        sb.append("name='").append(name).append('\'');
        sb.append(", host='").append(host).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
