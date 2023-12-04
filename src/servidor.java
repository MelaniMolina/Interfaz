import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args){

        try {
            //Crear una instancia de la implementacion de la interfaz
            interfaz objectoRemoto = new Implementacioninterfaz();
            //Crear y obtener un registro RMI en el puerto especifico
            Registry registro= LocateRegistry.createRegistry(1234);

            //Vincular la implementacion remota con el registro con un nombre especifico
            registro.rebind("Cliente_Remoto",objectoRemoto);
            System.out.println("Servidor remoto iniciado..............");
        }catch (RemoteException e){
            //Todo autogenerate catch block
            e.printStackTrace();

        }

    }
}
