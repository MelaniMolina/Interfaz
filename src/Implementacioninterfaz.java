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

    public  int Menu (int num) throws  RemoteException{
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("| \t C A L C U L D O R A                        |");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("1.- SUMA");
        System.out.println("2.- RESTA");
        System.out.println("3.- MULTIPLICACION");
        System.out.println("4.- DIVISION");
        System.out.print("Elija la Opcion: ");
        return num;
    }


}
