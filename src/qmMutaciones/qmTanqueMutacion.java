package qmMutaciones;

import qmFanerozoico.qmHagfishes;

public class qmTanqueMutacion {

    private String qmSuApellido;
    private String especieMutada = null;

    public qmTanqueMutacion(String qmSuApellido){
        this.qmSuApellido = qmSuApellido;
    }

    public Boolean qmPuedeMutar(String qmSuAnimal){
        return qmSuAnimal.equalsIgnoreCase("Hagfishes");
    }

    public String qmMutar(String qmSuAnimal){

        if(qmPuedeMutar(qmSuAnimal)){
            especieMutada = "Hagfishes" + qmSuApellido;
            System.out.println("Mutación exitosa: " + especieMutada);
            return especieMutada;
        }

        System.out.println("Mutación fallida.");
        return null;
    }

    public void qmMostrarJerarquia(){

        qmHagfishes base = new qmHagfishes();

        base.qmMostrarJerarquia();

        if(especieMutada != null){
            mostrarCargaMutacion(especieMutada, 7);
        }
    }
    public void qmMenuProcesomSv(){

    int radonTotal = (int)(Math.random() * 901) + 100;

    int radonActual = (int)(Math.random() * radonTotal);

    System.out.print("Mutación en proceso: ---------------------- "
            + radonActual + " de " + radonTotal + " (mSv)");
}


    private void mostrarCargaMutacion(String nombre, int tabs){

        char[] signos = {'|', '/', '-', '\\'};

        for (int i = 0; i <= 100; i++) {
            int signoIndex = i % 4;

            String guiones = "-".repeat(tabs);

            System.out.print("\r" + signos[signoIndex] + " " + i + "% " + guiones + " " + nombre);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
