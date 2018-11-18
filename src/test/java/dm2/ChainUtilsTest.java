package dm2;


import org.junit.Assert;
import org.junit.Test;

/**
 * Ne touchez pas à cette classe de test.
 * Une fois avoir implémenté la classe demandé, ce test devra fonctionner.
 */
public class ChainUtilsTest {
    private ChainUtils chainUtils = new ChainUtils();

    @Test
    public void testCapitalize_nominal() {
        // GIVEN
        String expected = "Hello World";
        String c = "hELLo wORLd";

        // WHEN
        String actual = chainUtils.capitalize(c);

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCapitalize_error_wrongParameter() {
        // GIVEN
        String c = null;

        // WHEN
        String actual = chainUtils.capitalize(c);

        // THEN => EXCEPTION
    }
}