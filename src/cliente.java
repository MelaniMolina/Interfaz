import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        //Creamos el registro en el puerto especifico
        try {
            Registry registro = LocateRegistry.getRegistry("localhost",1234);
            //Crear instancia de la implementacion de la interfaz remota
            interfaz objetoRemoto = (interfaz) registro.lookup("Cliente_Remoto");

            //Invocacion de los metodos mediante el uso de la interfaz(Capa intermedia entre el cliente y el servidor)
            String mensaje = objetoRemoto.mensaje();
            String msjBienvenido = objetoRemoto.msjBienvenido();
            System.out.println(mensaje+msjBienvenido);



            double respuesta =objetoRemoto.suma(3,5);
            double resta =objetoRemoto.resta(25,5);
            double multiplicacion =objetoRemoto.multiplicacion(5,5);
            double division =objetoRemoto.division(10,5);
            System.out.println("La respuesta de la suma es: "+respuesta);





        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
