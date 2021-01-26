import javax.swing.*;
import java.io.IOException;
public class Menu {

    //Declaración de objetos para acceder a otras clases
    GestorDatos imprimir = new GestorDatos();
    Metodo metodos = new Metodo();

    public enum Tipo {
        AñadirProductos, AñadirCompletos, AñadirSopaipillas, AñadirPanConQueso, MostrarLista, VentanaDeCompra,
        AñadirMasProductos, QuitarProductos, QuitarCompletos, QuitarSopaipillas, QuitarPanConQueso, Pagar
    }   //Opciones JOP

    void Ventana1() throws IOException {

        Tipo[] opciones1 = {Tipo.AñadirProductos, Tipo.VentanaDeCompra};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[1]);
        while (opcion != null) {
            switch (opcion) {
                case AñadirProductos:
                    AñadirProductos();
                    break;

                case VentanaDeCompra:
                    Ventana2();
                    break;


            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[1]);
        }
    }    //Método para desplegar la ventana1

    void AñadirProductos() {
        Tipo[] opcionesAñadir = {Tipo.AñadirCompletos, Tipo.AñadirSopaipillas, Tipo.AñadirPanConQueso};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción\n" +
                        "Presione Cancel para volver",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesAñadir, opcionesAñadir[2]);
        while (opcion != null) {
            switch (opcion) {
                case AñadirCompletos:
                    metodos.AñadirCompletos();
                    break;

                case AñadirSopaipillas:
                    metodos.AñadirSopaipillas();
                    break;

                case AñadirPanConQueso:
                    metodos.AñadirPanesConQueso();
                    break;

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion\n" +
                            "Pulse Cancel para volver",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesAñadir, opcionesAñadir[2]);
        }


    }    //método para elegir que producto añadir, y llamar a los métodos correspondientes

    void Ventana2() throws IOException {
        Tipo[] opciones2 = {Tipo.MostrarLista, Tipo.AñadirMasProductos, Tipo.QuitarProductos, Tipo.Pagar};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[3]);
        while (opcion != null) {
            switch (opcion) {
                case MostrarLista:
                    metodos.MostrarLista();
                    Ventana2();
                    break;

                case AñadirMasProductos:
                    AñadirProductos();
                    break;

                case QuitarProductos:
                    QuitarProductos();
                    break;

                case Pagar:
                    Ventana3();
                    System.exit(1);

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion\n",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[3]);
        }
    }     //método para desplegar la ventana2

    void QuitarProductos() throws IOException {
        Tipo[] opcionesQuitar = {Tipo.QuitarCompletos, Tipo.QuitarSopaipillas, Tipo.QuitarPanConQueso};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción\n" +
                        "Presione Cancel para volver",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesQuitar, opcionesQuitar[2]);
        while (opcion != null) {
            switch (opcion) {
                case QuitarCompletos:
                    metodos.QuitarCompletos();
                    break;

                case QuitarSopaipillas:
                    metodos.QuitarSopaipillas();
                    break;

                case QuitarPanConQueso:
                    metodos.QuitarPanesConQueso();
                    break;

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion\n" +
                            "Pulse Cancel para volver",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesQuitar, opcionesQuitar[2]);
        }
    }     //método para elegir que producto quitar, y llamar a los métodos correspondientes

    void Ventana3() throws IOException {
        metodos.MostrarBoleta();
        imprimir.ImprimirBoleta();


    }     //Método para llamar a la ventana3
}


