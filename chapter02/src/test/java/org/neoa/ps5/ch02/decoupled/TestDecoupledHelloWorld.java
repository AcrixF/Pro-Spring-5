package org.neoa.ps5.ch02.decoupled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestDecoupledHelloWorld {

    @Test
    public void testDecoupledDIPure() {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);

        assertNotNull(mr.getMessageProvider());
        assertEquals(mp.getMessage(), "Hello World!");
    }

}
