package paqueteClases;

public class Empleado {
    private Categoria categoria;
    private Bono bono;
    private int cantidadFaltas;


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }

    public double sueldo(){
        return categoria.getSueldoneto()+bono.calculoBono(cantidadFaltas);
    }

}
