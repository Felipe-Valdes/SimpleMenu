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

    public int AñadirCompletos() {
        try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere añadir?"));
            this.nCompletos = a + this.nCompletos;
            JOptionPane.showMessageDialog(null,"Ha añadido: "+a+ " completos");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }
        return this.nCompletos;

    }

    //método para quitar completos

    public int QuitarCompletos() throws IOException {
        Menu menu = new Menu();
        if (this.nCompletos == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.Ventana2();
        }
        try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere quitar?"));
            this.nCompletos = this.nCompletos - a;
            //si se quita demasiado y el valor pasa a negativo, se quedará en 0
            if (this.nCompletos<0) {
                this.nCompletos = 0;
            }else
                JOptionPane.showMessageDialog(null, "Ha quitado: " + a + " completos");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }
        return this.nCompletos;
    }



    //método para añadir sopaipillas

    public int AñadirSopaipillas() {
        try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos completos quiere añadir?"));
            this.nSopaipillas = a + this.nSopaipillas;
            JOptionPane.showMessageDialog(null,"Ha añadido: "+a+ " completos");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }
        return this.nSopaipillas;

    }

    //método para quitar sopaipillas

    public int QuitarSopaipillas() throws IOException {
        Menu menu = new Menu();
        if (this.nSopaipillas == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.Ventana2();
        }
        try{
            int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere quitar?"));
            this.nSopaipillas = this.nSopaipillas - b;
            //si se quita demasiado y el valor pasa a negativo, se quedará en 0
            if (this.nSopaipillas<0) {
                this.nSopaipillas = 0;
            }else
                JOptionPane.showMessageDialog(null, "Ha quitado: " + b + " sopaipillas");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }
        return this.nSopaipillas;
    }



    //método para añadir panes con queso

    public int AñadirPanesConQueso() {
        try{
            int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere añadir?"));
            this.nPanesConQueso = c + this.nPanesConQueso;
            JOptionPane.showMessageDialog(null,"Ha añadido: "+c+ " panes con queso");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }
        return this.nPanesConQueso;

    }

    //método para quitar panes con queso

    public int QuitarPanesConQueso() throws IOException {
        Menu menu = new Menu();
        if (this.nPanesConQueso == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.Ventana2();
        }
        try{
            int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere quitar?"));
            this.nPanesConQueso = this.nPanesConQueso - c;
            //si se quita demasiado y el valor pasa a negativo, se quedará en 0
            if (this.nPanesConQueso<0) {
                this.nPanesConQueso = 0;
            }else
                JOptionPane.showMessageDialog(null, "Ha quitado: " + c + " panes con queso");
        }catch (NumberFormatException e){
            System.out.println("invalido");
        }
        return this.nPanesConQueso;
    }

    public int CalcularValor(){
        int valorTotal = (this.nCompletos*this.precioCompletos)+(this.nSopaipillas*this.precioSopaipillas)+(this.nPanesConQueso*this.precioPanConQueso);
        return valorTotal;
    }

    public void MostrarLista(){
        JOptionPane.showMessageDialog(null, "Hasta ahora lleva:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso\n" +
                "Y le estaría costando: "+CalcularValor());
    }

    public void MostrarBoleta(){
        JOptionPane.showMessageDialog(null, "Ha comprado:\n" +
                +Metodo.nCompletos+" Completos\n" +
                +Metodo.nSopaipillas+" Sopaipillas\n" +
                +Metodo.nPanesConQueso+" Panes con queso\n" +
                "Y le ha costado: "+CalcularValor());

    }


}
