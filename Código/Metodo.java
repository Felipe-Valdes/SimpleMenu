import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Metodo {
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
        this.nPanesConQueso = nPanesConQueso + this.nPanesConQueso;
        return this.nPanesConQueso;
    }

    public void validar(int numero) {
        Menu menu = new Menu();
    }



}
