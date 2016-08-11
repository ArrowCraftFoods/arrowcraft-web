package com.arrowcraftfoods.hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloControllerTest {

    @InjectMocks
    private HelloController underTest;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnHelloWorld() {
        String result = underTest.hello();

        assertThat(result, is("Hello World!"));
    }
}