package qmFanerozoico;

import qmProterozoico.qmGnathostomata;

public class qmAgnathans extends qmGnathostomata {

    public qmAgnathans(String  qmNombreClase) {
        super(qmNombreClase);
    }
    public void qmSaludar(){
        System.out.println( getNombreClase()+" saluda a todos");
    }

    @Override
    public void qmMostrarJerarquia() {
       qmMostrarCarga("Agnathans", 8);
    }
}
