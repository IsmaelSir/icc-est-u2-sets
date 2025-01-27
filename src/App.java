import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparador;

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
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Ana", "Pérez", "987654321"));
        agenda.add(new Contacto("Luis", "Pérez", "11111111"));
        agenda.add(new Contacto("Pedro", "Lopez", "143546574"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        /*
        Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Comparacion con boolean");
        boolean comparaBoolean = c1 == c2;
        System.out.println(comparaBoolean);

        System.out.println("Comparacion con equal");
        boolean comparaEquas = c1.equals(c2);
        System.out.println(comparaEquas);

        System.out.println("Comparacion con HasCode");
        boolean comparaHasCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparaHasCode);*/
    }
}
