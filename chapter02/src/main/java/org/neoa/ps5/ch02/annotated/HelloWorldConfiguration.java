package org.neoa.ps5.ch02.annotated;

import org.neoa.ps5.ch02.decoupled.HelloWorldMessageProvider;
import org.neoa.ps5.ch02.decoupled.MessageProvider;
import org.neoa.ps5.ch02.decoupled.MessageRenderer;
import org.neoa.ps5.ch02.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer render() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
