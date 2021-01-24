import javax.swing.*;
import java.io.IOException;

public class Menu {

    GestorDatos imprimir = new GestorDatos();
    Metodo metodos = new Metodo();

    public enum Tipo {AñadirCompletos, AñadirSopaipillas, AñadirPanConQueso, VerLista,
    AñadirProductos, QuitarCompletos, QuitarSopaipillas, QuitarPanConQueso, Pagar}

    public void ventana1() throws IOException {

        Tipo[] opciones1 = {Tipo.AñadirCompletos, Tipo.AñadirSopaipillas, Tipo.AñadirPanConQueso, Tipo.VerLista};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[3]);
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

                case VerLista:
                    ventana2();
                    break;

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[3]);
        }
    }

    public void ventana2() throws IOException {
    Tipo[] opciones2 = {Tipo.AñadirProductos, Tipo.QuitarCompletos, Tipo.QuitarSopaipillas, Tipo.QuitarPanConQueso, Tipo.Pagar};
    Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
            "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[4]);
        while (opcion != null) {
        switch (opcion) {
            case AñadirProductos:
                ventana1();
                break;

            case QuitarCompletos:
                try{
                    int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere quitar?"));
                    if (a==0) {
                        JOptionPane.showMessageDialog(null, "No ha añadido completos aún");
                        ventana2();
                    }
                    metodos.quitarCompletos(a);
                }catch (NumberFormatException e){
                    System.out.println("invalido");
                }
                break;

            case QuitarSopaipillas:
                try{
                    int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere quitar?"));
                    if (b==0) {
                        JOptionPane.showMessageDialog(null, "No ha añadido sopaipillas aún");
                        ventana2();
                    }
                    metodos.quitarSopaipillas(b);
                }catch (NumberFormatException e){
                    System.out.println("invalido");
                }
                break;

            case QuitarPanConQueso:
                try{
                    int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere quitar?"));
                    if (c==0) {
                        JOptionPane.showMessageDialog(null, "No ha añadido panes con queso aún");
                        ventana2();
                    }
                    metodos.quitarPanConQueso(c);
                }catch (NumberFormatException e){
                    System.out.println("invalido");
                }
                break;

            case Pagar:
                ventana3();
                System.exit(0);

        }
        opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones2, opciones2[4]);
    }
}

    /*JOptionPane.showMessageDialog(null, "Hasta ahora lleva:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso");*/

    public void ventana3() throws IOException {
        JOptionPane.showMessageDialog(null, "Ha comprado:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso");
        imprimir.ImprimirBoleta();


    }
}



