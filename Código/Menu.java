import javax.swing.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);


    public enum Tipo {AñadirCompletos, AñadirSopaipillas, AñadirPanConQueso, VerLista, Pagar}

    public void ventana1() throws IOException {
        Metodo metodos = new Metodo();
        GestorDatos imprimir = new GestorDatos();

        Tipo[] opciones = {Tipo.AñadirCompletos, Tipo.AñadirSopaipillas, Tipo.AñadirPanConQueso, Tipo.VerLista, Tipo.Pagar};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[4]);
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
                    int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere añadir?"));
                    metodos.añadirSopaipillas(b);
                    break;

                case AñadirPanConQueso:
                    int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere añadir?"));
                    metodos.añadirPanesConQueso(c);
                    break;

                case VerLista:
                    ventana2();
                    break;

                case Pagar:
                    ventana3();
                    imprimir.ImprimirBoleta();
                    return;



            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[3]);
        }
    }



    public void ventana2() {
        JOptionPane.showMessageDialog(null, "Hasta ahora lleva:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso");
    }

    public void ventana3() {
        JOptionPane.showMessageDialog(null, "Ha comprado:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso");

    }
}


