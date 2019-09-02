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
        //Llamo al metodo calculo bono del objeto bono asi que
        // no importa el tipo de bono que le mande lo calculara el metodo
    }

}
