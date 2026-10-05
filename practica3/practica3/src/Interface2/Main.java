package Interface2;

public class Main {
    public static void main(String[] args) {
        System.out.println("/////////Interface 2///////");
        Antropologo a1=new Antropologo("juan", 87, 06767);
        Ingeniero i1=new Ingeniero("armando", 30, 99999997);
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
