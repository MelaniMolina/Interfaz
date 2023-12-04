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


}
