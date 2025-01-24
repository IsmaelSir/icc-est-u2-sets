import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets(){

    }
    public Set<String> contruirHastSet(){
        Set<String> miHashSet= new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("durasno");
        miHashSet.add("Uva");
        miHashSet.add("Pera");
        return miHashSet;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Durazno");
        miLinkedHashSet.add("Uva");
        miLinkedHashSet.add("pera");
        return miLinkedHashSet;
    }
    public Set<String> construirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Durazno");
        miTreeSet.add("Uva");
        miTreeSet.add("pera");
        
        return miTreeSet;
    }
    public Set<String> construirTreeSetConComparador(){
        //Implementacion de comparador para ordenar por longitud y luego alfabeticamente
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero compara la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                // si tiene la misma longitud, compara alfabeticamente
                if(resultado == 0){
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };
        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);
        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Pera");

        return miTreeSetComparador;
    }
}
