import java.util.InputMismatchException;
import java.util.Scanner;

public class Opciones {


    public void bienvenida() {
        System.out.println("Bienvenido al local genérico");

    }


    public void ventana1() {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            //las cosas a agregar están propensas a cambios//
            System.out.println("El siguiente menú indica las cosas que se pueden comprar");
            System.out.println("Pulse 1 para añadir completos");
            System.out.println("Pulse 2 para añadir sopaipillas");
            System.out.println("Pulse 3 para añadir pan con queso");
            System.out.println("Pulse 4 para ver la lista de su compra(ventana2)");


            try {

                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        //agregar validador para que no se seleccionen cantidades astronómicas//
                        //agregar método para agregar las cosas pedidas a su propia clase//
                        System.out.println("Ha seleccionado completos");
                        System.out.println("Cuántos quiere agregar");
                        salir = true;
                        break;
                    case 2:
                        System.out.println("Ha seleccionado Sopaipillas");
                        System.out.println("Cuántas quiere agregar");
                        salir = true;
                        break;
                    case 3:
                        System.out.println("Ha seleccionado pan con queso");
                        System.out.println("Cuántos quiere agregar");
                        salir = true;
                        break;
                    case 4:
                        //aquí vamos a llamar a la ventana 2, que muestra la lista de lo que lleva y el precio//
                        ventana2();
                        salir = true;
                        break;



                    default:
                        System.out.println("Seleccione un número válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                teclado.next();
            }
        }

    }

    public void ventana2() {
        System.out.println("hola, funcionó");

    }

    public void ventana3(){
        
    }
}


