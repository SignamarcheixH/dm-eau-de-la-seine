package dm2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link MathUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 * Vous ne devrez PAS modifier la classe {@link MathUtils}, mais observez attentivement l'implémentation des méthodes de la classe {@link MathUtils}
 */
public class MathUtilsTest {
    private MathUtils mathUtils = new MathUtils();

    // TODO: Créez les méthodes de test ICI
    @Test
    public void testpower_nominal(){
        //GIVEN
        int number = 5;
        int pow = 2;
        int expected = 25;
        //WHEN
        int actual = mathUtils.power(number, pow);
        //THEN
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testpower_zero(){
        //GIVEN
        int number = 0;
        int pow = 0;
        int expected = 1;
        //WHEN
        int actual = mathUtils.power(number,pow);
        //THEN
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testfactorial_nominal(){
        //GIVEN
        int n = 5;
        int expected = 120;
        //WHEN
        int actual = mathUtils.factorial(n);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testfactorial_zero(){
        //GIVEN
        int n = 0;
        int expected = 0;
        //WHEN
        int actual = mathUtils.factorial(n);
        //THEN
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testfactoriel_error(){
        //GIVEN
        int n = -1;
        //WHEN
        int actual = mathUtils.factorial(n);
        //THEN => EXCEPTION
    }

    @Test
    public void testfibonacci_nominal(){
        //GIVEN
        int n = 20;
        int expected = 6765;
        //WHEN
        int actual = mathUtils.fibonacci(n);
        //THEN
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testfibonacci_zero(){
        //GIVEN
        int n = 0;
        int expected = 0;
        //WHEN
        int actual = mathUtils.fibonacci(n);
        //THEN
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testfibonacci_error(){
        //GIVEN
        int n = -10;
        //WHEN
        int actual = mathUtils.fibonacci(n);
        //THEN => EXCEPTION
    }


}
