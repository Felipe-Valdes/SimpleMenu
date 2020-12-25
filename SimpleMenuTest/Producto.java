import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Producto {
    Scanner teclado = new Scanner(System.in);
    public static int nCompletos;
    public static int nSopaipillas;
    public static int nPanesConQueso;


    public int añadirCompletos(int nCompletos) {
        this.nCompletos = nCompletos + this.nCompletos;
        return this.nCompletos;
    }

    public int añadirSopaipillas(int nSopaipillas) {
        this.nSopaipillas = nSopaipillas + this.nSopaipillas;
        return this.nSopaipillas;
    }

    public int añadirPanesConQueso(int nPanesConQueso) {
        this.nPanesConQueso = nCompletos + this.nPanesConQueso;
        return this.nPanesConQueso;
    }

    public void validar(int numero) {
        Menus menu = new Menus();
        boolean check = false;
        Scanner teclado = new Scanner(System.in);
        while (!check) {
            try {
                if (numero > 0 && numero < 10) {
                    System.out.println("El número es válido");
                    System.out.println("");
                    check = true;
                } else {
                    System.out.println("Ha ingresado una cantidad inválida o muy grande");
                    System.out.println("");
                    menu.ventana1();

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                menu.ventana1();
                System.out.println("");


            }

        }
    }


}
