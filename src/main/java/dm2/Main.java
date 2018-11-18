package dm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        int[] tab = {15,1,4,5,6,4,8,4,7,4,0};
        SortUtils sortUtils = new SortUtils();
        int[] tabTrie = sortUtils.sort(tab);
        System.out.println(Arrays.toString(tabTrie));

        int[] tab2 = {1,4,5,4,2,5,3,2,1,9,8,6,4,8,7,5,6,3,0};
        List<Integer> liste = new ArrayList<>();
        liste.add(7);
        liste.add(2);
        liste.add(5);
        liste.add(2);
        liste.add(3);
        liste.add(0);
        liste.add(9);
        liste.add(7);
        liste.add(5);
        liste.add(1);
        liste.add(2);
        liste.add(9);
        liste.add(2);
        liste.add(7);
        liste.add(4);
        ListUtils listUtils =new ListUtils();
        List<List<Integer>> lister = listUtils.cut(liste,3);
        System.out.println(lister);

        ChainUtils chainUtils =new ChainUtils();
        String phrase = "Bonjour je suis HArRY PoTTER";
        System.out.println(chainUtils.capitalize(phrase));
    }
}
