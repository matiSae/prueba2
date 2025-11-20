
import qmMutaciones.qmTanqueMutacion;
import qmFanerozoico.qmHagfishes;
import qmFanerozoico.qmAgnathans;
import qmProterozoico.qmGnathostomata;

import java.util.Scanner;

public class qmControllerSisInformatico {

    public void inicializar(){

        Scanner sc = new Scanner(System.in);
        boolean salir=true;
        String apellido;
        System.out.println("=== SISTEMA DE MUTACIÓN BIOLÓGICA ===");
        do{
            salir=false;
            System.out.print("Ingrese su apellido para la mutación: ");
            apellido = sc.nextLine();
                salir = true;
                for (int i = 0; i < apellido.length(); i++) {
                    if (Character.isDigit(apellido.charAt(i))) {
                        salir = false;
                        break;
                    }
                }
                if (!salir) {
                    System.out.println("Error: no ingrese numeros ");
                }
        }while(!salir);

        qmTanqueMutacion tanque = new qmTanqueMutacion(apellido);

        qmGnathostomata gna = new qmGnathostomata("Gnathostomata");
        qmAgnathans agna = new qmAgnathans();
        qmHagfishes hag = new qmHagfishes();

        gna.qmMostrarJerarquia();
        agna.qmMostrarJerarquia();
        hag.qmMostrarJerarquia();
        System.out.println();


        System.out.println("\nIntentando mutar...");
        String nuevaEspecie = tanque.qmMutar("Hagfishes");

        System.out.println("\n--- JERARQUÍA POST-MUTACIÓN ---");
        System.out.println();
        tanque.qmMenuProcesomSv();
        System.out.println();
        gna.qmMostrarJerarquia();
        agna.qmMostrarJerarquia();
        hag.qmMostrarJerarquia();

        if(nuevaEspecie != null){
            tanque.qmMostrarJerarquia(nuevaEspecie); 
            System.out.println();
            System.out.println("Nueva especie creada: " + nuevaEspecie);
        }
    }
}
