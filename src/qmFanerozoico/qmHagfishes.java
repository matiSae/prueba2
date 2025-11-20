package qmFanerozoico;

public class qmHagfishes extends qmAgnathans {
    private String color;
    private Double altura;

    public qmHagfishes(String qmNombreClase,String color, Double altura){
        super(qmNombreClase);
        this.color=color;
        this.altura=altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void qmSaludar(String nombre){
        System.out.println(getNombreClase()+" saluda a "+nombre);
    }

    @Override
    public void qmMostrarJerarquia() {
        qmMostrarCarga("Hagfishes", 10);
    }
}
