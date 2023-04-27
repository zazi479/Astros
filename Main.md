import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);
   
    Planetas Jupiter = new Planetas("Jupiter",55845476,57.36,false,98755,64686,6548,55,56);   
    
    
    public int leerOpcion(){
        return scanner.nextInt();
    }
    public void  menu ( ){
        System.out.println("Elige una opcion");
        System.out.println("1.MOstrar toda la informacion ");
        System.out.println("2.Mostrar el nombre");
        System.out.println("3.Mostrar distancia al sol");
        System.out.println("4.Mostar gravedaad");
        System.out.println("5.Tiene satelites");
        System.out.println("6.Masa");
        System.out.println("7.Temperatura media");
        System.out.println("8. Salir");
    }
    public void iniciarPrograma(){
        int opcion = 1;
        boolean salir =false;
        while(!salir){
            menu();
            opcion=leerOpcion();
            switch (opcion){
                case 1 ->Jupiter.muestra();
                case 2 -> System.out.println(Jupiter.getNombre());
                case 3 -> System.out.println(Jupiter.getDistanciaAlSol());
                case 4 -> System.out.println(Jupiter.getGravedad());
                case 5 -> System.out.println("Tiene satelites:"+ Jupiter.isTieneSatelites());
                case 6 -> System.out.println(Jupiter.getMasa());
                case 7 -> System.out.println(Jupiter.getTemperaturaMedia());
                case 8 -> salir = true;
                default -> System.out.println("No es una opcion correcta");
                
            }
        }
    }


    public static void main(String[] args) {
        Main start = new Main();
        start.iniciarPrograma();
    }
}
