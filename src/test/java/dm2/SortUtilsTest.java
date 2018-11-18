package dm2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Ne touchez pas à cette classe de test.
 * Une fois avoir implémenté la classe demandé, ce test devra fonctionner.
 */
public class SortUtilsTest {
    private SortUtils sortUtils = new SortUtils();

    @Test
    public void testSort_nominal() {
        // GIVEN
        int[] a = new int[]{6, 4, 3, 4, 8, 9};
        int[] expected = new int[]{3, 4, 4, 6, 8, 9};

        // WHEN
        int[] actual = sortUtils.sort(a);

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort_emptyArray() {
        // GIVEN
        int[] a = new int[]{};
        int[] expected = new int[]{};

        // WHEN
        int[] actual = sortUtils.sort(a);

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSort_error(){
        // GIVEN
        int[] a = null;

        // WHEN
        int[] actual = sortUtils.sort(a);

        // THEN => EXCEPTION
    }
}
