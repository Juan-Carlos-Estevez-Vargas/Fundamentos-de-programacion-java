package HerenciaYTiposComodin;

public class Pareja<T> {

    private T primero;

    public Pareja() {
        primero = null;
    }

    public void setPrimero(T nuevovalor) {
        primero = nuevovalor;
    }
    
    public static void imprimirEmpleado(Pareja<? extends Empleado> p){
        Empleado primero  = p.getPrimero();
        System.out.println(primero);
    }

    public T getPrimero() {
        return primero;
    }

}
