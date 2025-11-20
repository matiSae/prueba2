package qmProterozoico;

public class qmGnathostomata {

    private String qmNombreClase;

    public qmGnathostomata(String qmNombreClase){
        this.qmNombreClase = qmNombreClase;
    }

    public void qmMostrarJerarquia() {
        qmMostrarCarga(qmNombreClase, 4);
    }

    protected void qmMostrarCarga(String nombre, int tabs) {

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

    public String getNombreClase() {
        return qmNombreClase;
    }
}
