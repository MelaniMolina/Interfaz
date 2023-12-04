import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLOutput;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        double uno, dos;
        int numero=0;
        //Creamos el registro en el puerto especifico
        try {
            Registry registro = LocateRegistry.getRegistry("localhost",1234);
            //Crear instancia de la implementacion de la interfaz remota
            interfaz objetoRemoto = (interfaz) registro.lookup("Cliente_Remoto");

            //Invocacion de los metodos mediante el uso de la interfaz(Capa intermedia entre el cliente y el servidor)

            String menu = objetoRemoto.obtenerMenu();
            System.out.println(menu);
            System.out.println("Escoga una opción: ");
            numero = sc.nextInt();

            switch (numero){
                case 1:
                    System.out.println("Suma");
                    System.out.print("Digite el primer número:  ");
                    uno = sc.nextDouble();
                    System.out.print("Digite el segundo número: ");
                    dos = sc.nextDouble();
                    double respuesta =objetoRemoto.suma(uno,dos);
                    System.out.println("La respuesta de la suma es: "+respuesta);
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.print("Digite el primer número:  ");
                    uno = sc.nextDouble();
                    System.out.print("Digite el segundo número: ");
                    dos = sc.nextDouble();
                    double resta =objetoRemoto.resta(uno,dos);
                    System.out.println("La respuesta de la resta es: "+resta);
                    break;
                case 3:
                    System.out.println("Multiplicación");
                    System.out.print("Digite el primer número:  ");
                    uno = sc.nextDouble();
                    System.out.print("Digite el segundo número: ");
                    dos = sc.nextDouble();
                    double multiplicacion =objetoRemoto.multiplicacion(uno,dos);
                    System.out.println("La respuesta de la multiplicación es: "+multiplicacion);
                    break;
                case 4:
                    System.out.println("División");
                    System.out.print("Digite el primer número:  ");
                    uno = sc.nextDouble();
                    System.out.print("Digite el segundo número: ");
                    dos = sc.nextDouble();
                    double division =objetoRemoto.division(uno,dos);
                    System.out.println("La respuesta de la división es: "+division);
                    break;

                default:
                    System.out.println("Ingrese la respuesta");

            }

















        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
