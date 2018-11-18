package dm2;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes.
 */

public class ChainUtils {

    /**
     * Prend une chaine de caractères en paramètre et retourne le mot avec la première lettre en majuscule.
     *
     * Ex: en entrée "jE sUIS baTMan" retournera "Je Suis Batman"
     *
     * @param chain		Chaine de caractères
     * @return
     */
    public String capitalize(String chain) {
        if(chain == null){
            throw new IllegalArgumentException("String given is null");
        }
        chain = chain.toLowerCase();
        String[] parts = chain.split(" ");
        String result = "";
        for (int i =0; i< parts.length; i++) {
            String word = "";
           // System.out.println(parts[i]);
            word +=  (char) (parts[i].charAt(0) - 'a' + 'A');
            for(int j = 1; j<parts[i].length(); j++){
                word += parts[i].charAt(j);
              //  System.out.println(word);
            }
            result = result + word + " ";
        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}
