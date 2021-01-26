import javax.swing.*;
import java.io.IOException;

public class Menu {

    GestorDatos imprimir = new GestorDatos();
    Metodo metodos = new Metodo();

    public enum Tipo {AñadirProductos, AñadirCompletos, AñadirSopaipillas, AñadirPanConQueso,MostrarLista, VentanaDeCompra,
    AñadirMasProductos,QuitarProductos, QuitarCompletos, QuitarSopaipillas, QuitarPanConQueso, Pagar}

    public void Ventana1() throws IOException {

        Tipo[] opciones1 = {Tipo.AñadirProductos,Tipo.MostrarLista, Tipo.VentanaDeCompra};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[2]);
        while (opcion != null) {
            switch (opcion) {
                case AñadirProductos:
                    AñadirProductos();
                    break;

                case MostrarLista:
                    JOptionPane.showMessageDialog(null, "Hasta ahora lleva:\n" +
                            +Metodo.nCompletos+" Completos\n" +
                            +Metodo.nSopaipillas+" Sopaipillas\n" +
                            +Metodo.nPanesConQueso+" Panes con queso");
                    break;

                case VentanaDeCompra:
                    Ventana2();
                    break;


            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[2]);
        }
    }

    public void AñadirProductos(){
        Tipo[] opcionesAñadir = {Tipo.AñadirCompletos, Tipo.AñadirSopaipillas, Tipo.AñadirPanConQueso};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción\n" +
                        "Presione Cancel para volver",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesAñadir, opcionesAñadir[2]);
        while (opcion != null) {
            switch (opcion) {
                case AñadirCompletos:
                    try{
                        int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere añadir?"));
                        metodos.añadirCompletos(a);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

                case AñadirSopaipillas:
                    try {
                        int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere añadir?"));
                        metodos.añadirSopaipillas(b);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

                case AñadirPanConQueso:

                    try {
                        int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere añadir?"));
                        metodos.añadirPanesConQueso(c);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesAñadir, opcionesAñadir[2]);
        }


    }

    public void Ventana2() throws IOException {
    Tipo[] opciones2 = {Tipo.MostrarLista, Tipo.AñadirMasProductos,Tipo.QuitarProductos, Tipo.Pagar};
    Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
            "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[3]);
        while (opcion != null) {
        switch (opcion) {
            case MostrarLista:
                JOptionPane.showMessageDialog(null, "Hasta ahora lleva:\n" +
                        +Metodo.nCompletos+" Completos\n" +
                        +Metodo.nSopaipillas+" Sopaipillas\n" +
                        +Metodo.nPanesConQueso+" Panes con queso");

            case AñadirMasProductos:
                Ventana1();
                break;

            case QuitarProductos:
                QuitarProductos();
                break;

            case Pagar:
                Ventana3();
                System.exit(1);

        }
        opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[3]);
    }
}

    public void QuitarProductos() throws IOException {
        Tipo[] opcionesQuitar = {Tipo.QuitarCompletos, Tipo.QuitarSopaipillas, Tipo.QuitarPanConQueso};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción\n" +
                        "Presione Cancel para volver",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesQuitar, opcionesQuitar[2]);
        while (opcion != null) {
            switch (opcion) {
                case QuitarCompletos:
                    try{
                        int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere quitar?"));
                        metodos.quitarCompletos(a);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

                case QuitarSopaipillas:
                    try{
                        int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere quitar?"));
                        metodos.quitarSopaipillas(b);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

                case QuitarPanConQueso:
                    try{
                        int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere quitar?"));
                        metodos.quitarPanConQueso(c);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesQuitar, opcionesQuitar[2]);
        }
    }


    public void Ventana3() throws IOException {
        JOptionPane.showMessageDialog(null, "Ha comprado:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso");
        imprimir.ImprimirBoleta();


    }
}


