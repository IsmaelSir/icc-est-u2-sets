import java.util.HashSet;
import java.util.Set;
import models.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        /*runHashSet();
        runlinkesHashSet();
        runTreeSet();
        runTreeSetComparador();*/
        runEjercicioContacto();
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
        Set<Contacto> agenda = new HashSet<>();

        agenda.add(new Contacto("Juan", "Pérez", "123456"));
        agenda.add(new Contacto("Ana", "Pérez", "987654"));
        agenda.add(new Contacto("Luis", "García", "456789"));
        agenda.add(new Contacto("Juan", "Perez", "2335475"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
