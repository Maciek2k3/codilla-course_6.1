package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    void burgerTest() {
        //GIVEN
        Bigmac bigmac = new Bigmac.burgersBuilder()
                .ingredient("Garlic")
                .bun("Sezam")
                .burgers(3)
                .sauce("Spicy")
                .ingredient("cheese")
                .build();
        //WHEN
        int ingrediensCalc = bigmac.getIngredients().size();
        //THEN
        assertEquals(2, ingrediensCalc);

    }
}
