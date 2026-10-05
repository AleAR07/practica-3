package Abstractas;

public class Main {
    public static void main(String[] args) {
        System.out.println("//////ABSTRACTAS///////////");
        Ingeniero i1=new Ingeniero("alejandro", 20, 300000000);
        Antropologo a1= new Antropologo("axel", 13, 676767);
        System.out.println("datos del ingeniero");
        i1.getEdad();
        i1.getNombre();
        i1.getSalario();
        System.out.println("datos del antropologo");
        a1.getEdad();
        a1.getNombre();
        a1.getSalario();
    }
       

    
}
