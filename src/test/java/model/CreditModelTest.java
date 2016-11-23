package model;

import model.entity.Credit;
import model.entity.Currency;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests for {@link CreditModel class}
 * Created by a-morenets on 24.11.2016.
 */
public class CreditModelTest {
    private CreditModel creditModel;

    @Before
    public void setUp() throws Exception {
        creditModel = new CreditModel();
    }

    @Test
    public void findCredits() throws Exception {
        /* Find credits with currency EUR and assert that list contains credits with EUR currency only */
        creditModel.findCredits(c -> c.getCurrency() == Currency.EUR)
                .forEach(credit -> assertTrue(credit.getCurrency() == Currency.EUR));
    }

    @Test
    public void initCredits() throws Exception {
        creditModel.initCredits();
        assertFalse(creditModel.getCreditList().isEmpty());
    }

}