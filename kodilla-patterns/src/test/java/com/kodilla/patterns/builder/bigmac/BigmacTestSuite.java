package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun(new Bun("SESAME"))
                .burgers(2)
                .sauce(new Sauce("BARBECUE"))
                .ingredient(new Ingredients("BACON"))
                .ingredient(new Ingredients("CHILI"))
                .ingredient(new Ingredients("CUCUMBER"))
                .build();

        System.out.println(bigmac);

        //When & Then
        assertEquals(2, bigmac.getBurgers());
        assertEquals(3, bigmac.getIngredients().size());
        assertEquals("BARBECUE", bigmac.getSauce().toString());
    }

}