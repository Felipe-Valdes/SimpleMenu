import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {

    Scanner teclado = new Scanner(System.in);

    public void bienvenida() {
        System.out.println("Bienvenido al local genérico");

    }


    public void ventana1() {
        Producto opciones = new Producto();


        int opcion = 0;
        do {
            try {
                System.out.println("");
                System.out.println("El siguiente menú indica las cosas que se pueden comprar...");
                System.out.println("");
                System.out.println("Pulse 1 para añadir completos");
                System.out.println("Pulse 2 para añadir sopaipillas");
                System.out.println("Pulse 3 para añadir pan con queso");
                System.out.println("Pulse 4 para ver la lista de su compra(ventana2)");
                System.out.println("Pulse 5 para salir (cerrar el programa)");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        //agregar validador para que no se seleccionen cantidades astronómicas//
                        //agregar método para agregar las cosas pedidas a su propia clase//
                        System.out.println("Ha seleccionado completos");
                        System.out.println("¿Cuántos completos quiere añadir? (máximo 10)");
                        int a = teclado.nextInt();
                        opciones.validar(a);
                        opciones.añadirCompletos(a);
                        break;

                    case 2:
                        System.out.println("Ha seleccionado sopaipillas");
                        System.out.println("¿Cuántas sopaipillas quiere añadir? (máximo 10)");
                        int b = teclado.nextInt();
                        opciones.validar(b);
                        opciones.añadirSopaipillas(b);
                        break;

                    case 3:
                        System.out.println("Ha seleccionado panes con queso");
                        System.out.println("¿Cuántos panes con queso quiere añadir? (máximo 10)");
                        int c = teclado.nextInt();
                        opciones.validar(c);
                        opciones.añadirPanesConQueso(c);
                        break;

                    case 4:
                        //aquí vamos a llamar a la ventana 2, que muestra la lista de lo que lleva y el precio//
                        ventana2();
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("Seleccione un número válido");


                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                teclado.next();
            }

        } while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);
    }


    public void ventana2() {
        System.out.println("Hasta ahora lleva:");
        System.out.println(Producto.nCompletos + " completos");
        System.out.println(Producto.nSopaipillas + " sopaipillas");
        System.out.println(Producto.nPanesConQueso + " panes con queso");
    }

    public void ventana3() {

    }
}


