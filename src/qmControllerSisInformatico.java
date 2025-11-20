
import qmMutaciones.qmTanqueMutacion;
import qmFanerozoico.qmHagfishes;
import qmFanerozoico.qmAgnathans;
import qmProterozoico.qmGnathostomata;

import java.util.Scanner;

public class qmControllerSisInformatico {

    public void inicializar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE MUTACIÓN BIOLÓGICA ===");
        System.out.print("Ingrese su apellido para la mutación: ");
        String apellido = sc.nextLine();

        qmTanqueMutacion tanque = new qmTanqueMutacion(apellido);

        qmGnathostomata gna = new qmGnathostomata("Gnathostomata");
        qmAgnathans agna = new qmAgnathans();
        qmHagfishes hag = new qmHagfishes();

        System.out.println("\n--- JERARQUÍA ORIGINAL ---");
        gna.qmMostrarJerarquia();
        agna.qmMostrarJerarquia();
        hag.qmMostrarJerarquia();
        System.out.println();


        System.out.println("\nIntentando mutar...");
        String nuevaEspecie = tanque.qmMutar("Hagfishes");

        System.out.println("\n--- JERARQUÍA POST-MUTACIÓN ---");
        
        tanque.qmMenuProcesomSv();
        System.out.println();
        gna.qmMostrarJerarquia();
        agna.qmMostrarJerarquia();
        hag.qmMostrarJerarquia();
        System.out.println();

        if(nuevaEspecie != null){
            tanque.qmMostrarJerarquia(); 
            System.out.println("Nueva especie creada: " + nuevaEspecie);
        }
    }
}
