import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Implementacioninterfaz extends UnicastRemoteObject implements interfaz {
    public Implementacioninterfaz() throws RemoteException{
        super();
    }
    //Implementar metodos indicados en la interfaz
    public String mensaje() throws RemoteException{
        return "Hola desde el servidor";
    }
    public String msjBienvenido() throws RemoteException{
        return "Bienvenido a la Calculadora";
    }

    public double suma(double a, double b) throws RemoteException{
        return a+b;
    }

    public double resta(double a , double b) throws RemoteException{
        return a-b;
    }

    public double multiplicacion(double a , double b) throws RemoteException{
        return a*b;
    }

    public double division(double a , double b) throws RemoteException{
        return a/b;
    }

    public String obtenerMenu() throws RemoteException {
        StringBuilder menu = new StringBuilder();
        menu.append("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-\n");
        menu.append("| \t C A L C U L A D O R A                        |\n");
        menu.append(" /-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-\n");
        menu.append("1.- SUMA\n");
        menu.append("2.- RESTA\n");
        menu.append("3.- MULTIPLICACION\n");
        menu.append("4.- DIVISION\n");
        menu.append("Elija la Opcion: ");
        return menu.toString();
    }


}
