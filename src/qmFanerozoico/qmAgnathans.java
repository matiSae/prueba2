package qmFanerozoico;

import qmProterozoico.qmGnathostomata;

public class qmAgnathans extends qmGnathostomata {

    public qmAgnathans() {
        super("Agnathans");
    }

    @Override
    public void qmMostrarJerarquia() {
       qmMostrarCarga("Agnathans", 8);
    }
}
