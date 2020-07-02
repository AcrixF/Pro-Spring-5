package org.neoa.ps5.ch02.decoupled;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestDecoupleHelloWorldXML {

    @Test
    public void testDecoupledXML() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        assertNotNull(ctx);

        MessageRenderer messageRenderer = ctx.getBean(MessageRenderer.class);
        assertNotNull(messageRenderer);

        assertEquals(messageRenderer.getMessageProvider().getMessage(), "Hello World!");
    }

}
