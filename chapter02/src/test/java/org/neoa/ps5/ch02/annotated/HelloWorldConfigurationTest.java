package org.neoa.ps5.ch02.annotated;

import org.junit.jupiter.api.Test;
import org.neoa.ps5.ch02.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HelloWorldConfigurationTest {

    @Test
    public void annotatedBeanConfigTest() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer render = ctx.getBean(MessageRenderer.class);

        assertNotNull(ctx);
        assertNotNull(render);
        assertNotNull(render.getMessageProvider());
        assertEquals(render.getMessageProvider().getMessage(), "Hello World!");
    }

}
