import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resp1, resp2, resp4;
        float velocidad;
        ArrayList<Vehiculo>[] vehiculo;

//      Creación objetos de la clase automovil
        Automovil automovil1 = new Automovil("Toyota", "ARS217", "2020", 30, "Encendido");
        Automovil automovil2 = new Automovil("Mazda", "JCP126", "2017", 60, "Encendido");
        Automovil automovil3 = new Automovil("BMW", "RND292", "2019", 0, "Apagado");
        Automovil[] automoviles = {automovil1, automovil2, automovil3};

//      Creación objetos de la clase Motocicleta
        Motocicleta motocicleta1 = new Motocicleta("Honda", "RSJ25G", "2023", 70, "Encendido");
        Motocicleta motocicleta2 = new Motocicleta("Yamaha", "IPJ07E", "2016", 0, "Encendido");
        Motocicleta[] motocicletas = {motocicleta1, motocicleta2};

        System.out.println(" ");
        System.out.println("-------------Bienvenido(a) al sistema de gestión automotriz-------------");
        System.out.println(" ");
        do {
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Automovil");
            System.out.println("2. Motocicleta");
            resp1 = input.nextInt();
            if (resp1 < 1 || resp1 >2) {
                System.out.println("Por favor seleccione una respuesta válida.");
            }
        }while(resp1 < 1 || resp1 > 2);
        Vehiculo resp3 = null;

        if (resp1 == 1) {
            do {
                System.out.println("Seleccione un automovil:");
                System.out.println("Automovil 1: " + automovil1.marca);
                System.out.println("Automovil 2: " + automovil2.marca);
                System.out.println("Automovil 3: " + automovil3.marca);
                resp2 = input.nextInt();
                if (resp2 < 1 || resp2 > 3) {
                    System.out.println("Por favor seleccione una respuesta válida.");
                }
            } while(resp2 < 1 || resp2 > 3);
            System.out.println("¿Qué desea hacer con el automóvil " + resp2 + "?");
            System.out.println(" ");
            resp3 = automoviles[resp2 - 1];
        } else {
            do {
                System.out.println("Seleccione una motocicleta:");
                System.out.println("Motocicleta 1: " + motocicleta1.marca);
                System.out.println("Motocicleta 2: " + motocicleta2.marca);
                resp2 = input.nextInt();
                if (resp2 < 1 || resp2 >2) {
                    System.out.println("Por favor seleccione una respuesta válida.");
                }
            }while(resp2 < 1 || resp2 > 2);
            System.out.println("¿Qué desea hacer con la motocicleta " + resp2 + "?");
            System.out.println(" ");
            resp3 = motocicletas[resp2 - 1];
        }
        do {
            System.out.println("-------Menú de opciones-------");
            System.out.println("1.Encender o apagar vehículo");
            System.out.println("2.Mostrar información del vehículo");
            System.out.println("3.Acelerar el vehículo");
            System.out.println("4.Frenar el vehículo");
            System.out.println("5.Conocer el estado del movimiento del vehículo");
            System.out.println("6.Salir");
            resp4 = input.nextInt();

           switch (resp4) {
               case 1:
                   resp3.onOff();
                   System.out.println(" ");
                   continue;
               case 2:
                   System.out.println(resp3.toString());
                   System.out.println(" ");
                   continue;

               case 3:
                   System.out.println("¿Cuánto desea acelerar?");
                   velocidad = input.nextFloat();
                   System.out.println(resp3.acelerar(velocidad));
                   System.out.println(" ");
                   continue;
               case 4:
                   resp3.frenar();
                   System.out.println(" ");
                   continue;
               case 5:
                   System.out.println(resp3.obtenerEstado());
                   System.out.println(" ");
                   continue;
               case 6:
                   System.out.println("¡Hasta la próxima!");
                   break;
               default:
                   System.out.println("Por favor seleccione una opción válida.");
                   System.out.println(" ");
           }
        } while (resp4 != 6);
    }
}