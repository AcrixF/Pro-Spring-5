package org.neoa.ps5.ch03.dp;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.neoa.ps5.ch02.decoupled.MessageRenderer;

public class DependencyPullTest {

    @Test
    public void testDependencyPull() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        assertNotNull(ctx);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        assertEquals(mr.getMessageProvider().getMessage(), "Hello World!");
    }
}
