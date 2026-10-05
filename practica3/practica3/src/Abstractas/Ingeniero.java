package Abstractas;
public class Ingeniero extends Trabajador{
    double salario;
    public Ingeniero(String nombre, int edad,double salario){
    super(nombre, edad);
    this.salario=salario;
    }
    @Override 
    public double getSalario(){
        return salario;
    }


}

