package com.rgomes.admin.catalogo.infrastructure;

import com.rgomes.admin.catalogo.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {

    @Test
    public void newCategoryTest(){

        assertNotNull(new Category());
    }
}
