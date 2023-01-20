package com.rgomes.admin.catalogo.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UseCaseTest {

    @Test
    public void useCaseTest(){

        assertNotNull(new UseCase());
        assertNotNull(new UseCase().execute());
    }
}
