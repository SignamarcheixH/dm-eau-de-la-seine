package dm2;


import java.util.Arrays;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes de la classe courante
 * TODO: Attention, vous n'avez pas le droit d'utiliser la fonction `sort()` de la bibliothèque Java, sinon ce serait trop facile.
 */
public class SortUtils {

    /**
     * Prend un paramètre un tableau et tri les valeurs dans l'entre croissant.
     *
     * Ex: en entrée => "[6, 4, 3, 4, 8, 9]" donne en sortie "[3, 4, 4, 6, 8, 9]"
     *
     * Un tableau vide (un tableau qui existe mais qui n'a pas d'élément) devra retourner un tableau vide.
     * Un tableau null devra déclencher un {@link IllegalArgumentException}
     *
     * @param array 	Tableau avec des élément en désordre
     * @return			Tableau avec des élément dans l'ordre
     */
    public int[] sort(int[] array) {
        //
        if(array == null){
            throw new IllegalArgumentException("The given array is null");
        }
        int startIdx = 0;
        int endIdx = array.length -1;
        int tmpValue = 0;
        for(int i = array.length -1  ; i  >= 1 ; i--){
            int maxNumberIdx = 0;
            int maxNumberValue = 0;
            for(int j = 0 ; j < i+1 ; j++ ){
                if (array[j] > maxNumberValue){
                    maxNumberValue = array[j];
                    maxNumberIdx = j;
                }
            }
            tmpValue = array[i];
            array[i] = array[maxNumberIdx];
            array[maxNumberIdx] = tmpValue;
        }
        return array;
    }
}