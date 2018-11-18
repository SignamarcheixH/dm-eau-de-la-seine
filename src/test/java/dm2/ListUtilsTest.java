package dm2;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link ListUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 */
public class ListUtilsTest {
    private ListUtils listUtils = new ListUtils();

    @Test
    public void testcut_nominal() {
        // GIVEN
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(0);
        list.add(9);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(2);
        list.add(7);
        list.add(4);
        int size = 3;
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sublist.add(7);
        sublist.add(2);
        sublist.add(5);
        expected.add(sublist);
        sublist=new ArrayList<>();
        sublist.add(2);
        sublist.add(3);
        sublist.add(0);
        expected.add(sublist);
        sublist=new ArrayList<>();
        sublist.add(9);
        sublist.add(7);
        sublist.add(5);
        expected.add(sublist);
        sublist=new ArrayList<>();
        sublist.add(1);
        sublist.add(2);
        sublist.add(9);
        expected.add(sublist);
        sublist=new ArrayList<>();
        sublist.add(2);
        sublist.add(7);
        sublist.add(4);
        expected.add(sublist);

        // WHEN
        List<List<Integer>> actual = listUtils.cut(list,size);

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcut_emptyList(){
        //GIVEN
        List<Integer> list = new ArrayList<>();
        int size = 10;
        List<List<Integer>> expected = new ArrayList<>();
        //WHEN
         List<List<Integer>> actual = listUtils.cut(list, size);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class )
    public void testcut_error(){
        //GIVEN
        List<Integer> list = null;
        int size = 10;
        //WHEN
            List<List<Integer>> actual = listUtils.cut(list, size);

        //THEN => EXCEPTION
    }




}