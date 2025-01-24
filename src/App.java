import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparador;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();
        runlinkesHashSet();
        runTreeSet();
        runTreeSetComparador();
    }

    public static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.contruirHastSet();
        System.out.println("----- HashSet -------");
        System.out.println("Elementos del HashSet (no se garantiza el orden)");
        for(String elementos : ejemploHashSet){
            System.out.println(elementos);
        }
    }

    public static void  runlinkesHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHedhSet -------");
        System.out.println("Elementos del HashSet (respeta el orden de llegada)");
        for(String elementos : ejemploLinkedHashSet){
            System.out.println(elementos);
    }
    }

    public static void runTreeSet(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("----- TreeSet -------");
        System.out.println("Elementos del TreeSet (orden alfabetico):");
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparador(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparador = sets.construirTreeSetConComparador();
        System.out.println("----- TreeSetComparador -------");
        System.out.println("Elementos del TreeSet (orden por longitud y alfabetico):");
        for (String elemento : ejemploTreeSetComparador) {
            System.out.println(elemento+ " (Longitud: "+elemento.length()+ " )");
        }
    }

    private static void runEjercicioContacto(){
        Set<Contacto> agenda= new TreeSet<>(new ContactoComparador());
    }
}
