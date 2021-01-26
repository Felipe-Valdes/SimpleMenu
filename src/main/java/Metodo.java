import javax.swing.*;
import java.io.IOException;


public class Metodo {
    public static int nCompletos = 0;
    public static int nSopaipillas = 0;
    public static int nPanesConQueso = 0;

    //completos

    public int añadirCompletos(int a) {
        this.nCompletos = a + this.nCompletos;
        JOptionPane.showMessageDialog(null,"Ha añadido: "+a+ " completos");
        return this.nCompletos;
    }
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



    //sopaipillas

    public int añadirSopaipillas(int b) {
        this.nSopaipillas = b + this.nSopaipillas;
        JOptionPane.showMessageDialog(null,"Ha añadido: "+b+ " Sopaipillas");
        return this.nSopaipillas;
    }
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



    //panes con queso

    public int añadirPanesConQueso(int c) {
        this.nPanesConQueso = c + this.nPanesConQueso;
        JOptionPane.showMessageDialog(null,"Ha añadido: "+c+ " panes con queso");
        return this.nPanesConQueso;
    }
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

