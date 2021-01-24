import javax.swing.*;
import java.io.IOException;


public class Metodo {
    public static int nCompletos;
    public static int nSopaipillas;
    public static int nPanesConQueso;

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
            menu.ventana2();
        }
            this.nCompletos = this.nCompletos - a;
        JOptionPane.showMessageDialog(null, "Ha quitado: " + a + " completos");
        return this.nCompletos;
    }



    //sopaipillas

    public int añadirSopaipillas(int nSopaipillas) {
        this.nSopaipillas = nSopaipillas + this.nSopaipillas;
        JOptionPane.showMessageDialog(null,"Ha añadido: "+this.nSopaipillas+ " Sopaipillas");
        return this.nSopaipillas;
    }
    public int quitarSopaipillas(int b) throws IOException {
        Menu menu = new Menu();
        if (this.nSopaipillas == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.ventana2();
        }
        this.nSopaipillas = this.nSopaipillas - b;
        JOptionPane.showMessageDialog(null, "Ha quitado: " + b + " Sopaipillas");
        return this.nSopaipillas;
    }



    //panes con queso

    public int añadirPanesConQueso(int nPanesConQueso) {
        this.nPanesConQueso = nPanesConQueso + this.nPanesConQueso;
        JOptionPane.showMessageDialog(null,"Ha añadido: "+this.nPanesConQueso+ " panes con queso");
        return this.nPanesConQueso;
    }
    public int quitarPanConQueso(int c) throws IOException {
        Menu menu = new Menu();
        if (this.nPanesConQueso == 0){
            JOptionPane.showMessageDialog(null, "No ha añadido nada aún");
            menu.ventana2();
        }
        this.nPanesConQueso = this.nPanesConQueso - c;
        JOptionPane.showMessageDialog(null, "Ha quitado: " + c + " panes con queso");
        return this.nPanesConQueso;
    }

}
