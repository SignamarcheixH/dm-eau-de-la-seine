package dm2;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes de la classe courante..
 */
public class ListUtils {

    /**
     * Prend une liste en paramètre, la découpe et retourne une liste de liste avec la taille indiquée.
     *
     * Ex: en entrée j'ai une liste de 41 éléments, j'indique la taille (size) de découpage à 10,
     * et j'obtiens en sortie une liste de 5 listes dont les 4 premières listes contiennent 10 éléments et la dernière liste 1 élément
     *
     * @param list		Une liste
     * @param size		Taille désirée
     * @return
     */
    public <T> List<List<T>> cut(List<T> list, int size) {
        if (list ==null){
            throw new IllegalArgumentException("list given is null");
        }
         List<List<T>> bigList = new ArrayList<List<T>>();
         int splitIdx = 0;
         List<T> currentList = new ArrayList<T>();
         for (int i=0; i< list.size(); i++){
             currentList.add(list.get(i));
             splitIdx+=1;
             if(splitIdx == size){
                 bigList.add(currentList);
                 splitIdx =0;
                 currentList =new ArrayList<T>();
             }
         }
         if( currentList.size() != 0){
             bigList.add(currentList);
         }
        return bigList;
    }
}