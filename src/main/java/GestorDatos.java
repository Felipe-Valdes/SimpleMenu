import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorDatos {
    Metodo metodo = new Metodo();
    //método para crear el archivo .txt con los datos

    void ImprimirBoleta() throws IOException {
        File boleta = new File("boleta.txt");
        FileWriter fw = new FileWriter(boleta);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Ha comprado: ");
        pw.println(metodo.nCompletos + " Completos");
        pw.println(metodo.nSopaipillas + " Sopaipillas");
        pw.println(metodo.nPanesConQueso + " Panes con queso");
        pw.println("Y le ha costado: " + metodo.CalcularValor() + "$");

        pw.close();
    }

}
