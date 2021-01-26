import javax.swing.*;
import java.io.IOException;


public class Metodo {

    //variables globales
    public static int nCompletos = 0;
    public static int nSopaipillas = 0;
    public static int nPanesConQueso = 0;

    //precios
    public static int precioCompletos = 1000;
    public static int precioSopaipillas = 150;
    public static int precioPanConQueso = 750;


    //método para añadir completos

    public void añadirCompletos() {
        try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere añadir?"));
            this.nCompletos = a + this.nCompletos;
            JOptionPane.showMessageDialog(null,"Ha añadido: "+a+ " completos");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }

    }

    //método para quitar completos

    public int quitarCompletos(int a) throws IOException {
        Menu menu = new Menu();
        if (this.nCompletos == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.Ventana2();
        }
            this.nCompletos = this.nCompletos - a;
        //si se quita demasiado y el valor pasa a negativo, se quedará en 0
        if (this.nCompletos<0) {
            this.nCompletos = 0;
        }else
            JOptionPane.showMessageDialog(null, "Ha quitado: " + a + " completos");
        return this.nCompletos;
    }



    //método para añadir sopaipillas

    public void añadirSopaipillas() {
        try{
            int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere añadir?"));
            this.nSopaipillas = b + this.nSopaipillas;
            JOptionPane.showMessageDialog(null,"Ha añadido: "+b+ " sopaipillas");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }

    }

    //método para quitar sopaipillas

    public int quitarSopaipillas(int b) throws IOException {
        Menu menu = new Menu();
        if (this.nSopaipillas == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.Ventana2();
        }
        this.nSopaipillas = this.nSopaipillas - b;
        //si se pasa a negativo el valor quedará en 0
        if (this.nSopaipillas <0){
            this.nSopaipillas = 0;
        }else
            JOptionPane.showMessageDialog(null, "Ha quitado: " + b + " Sopaipillas");
        return this.nSopaipillas;
    }



    //método para añadir panes con queso

    public void añadirPanesConQueso() {
        try{
            int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere añadir?"));
            this.nCompletos = c + this.nCompletos;
            JOptionPane.showMessageDialog(null,"Ha añadido: "+c+ " panes con queso");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }

    }

    //método para quitar panes con queso

    public int quitarPanConQueso(int c) throws IOException {
        Menu menu = new Menu();
        if (this.nPanesConQueso == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.Ventana2();
        }
        this.nPanesConQueso = this.nPanesConQueso - c;
        //si se pasa a negativo el valor se quedará en 0
        if (this.nPanesConQueso<0){
            this.nPanesConQueso=0;
        }
            JOptionPane.showMessageDialog(null, "Ha quitado: " + c + " panes con queso");
        return this.nPanesConQueso;
    }




}
