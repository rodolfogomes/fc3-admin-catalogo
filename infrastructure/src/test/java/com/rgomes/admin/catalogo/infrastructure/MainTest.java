package com.rgomes.admin.catalogo.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void mainTest(){
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }
}
