public class Editar{
  //no se pa q es esto pero lo pongo iwal
  public enum Tipo{ AñadirCompletos, AñadirSopaipillas, AñadirPanConQueso, QuitarCompletos, QuitarSopaipillas, QuitarPanConQueso}
  
  public int añadir(){
  Tipo[] opcionesAñadir = {Tipo.AñadirCompletos, Tipo.AñadirSopaipillas, Tipo.AñadirPanConQueso};
        Tipo opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opción\n" +
                        "Presione Cancel para volver",
                "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesAñadir, opcionesAñadir[2]);
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
                    try {
                        int b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas sopaipillas quiere añadir?"));
                        metodos.añadirSopaipillas(b);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

                case AñadirPanConQueso:
                    try {
                        int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos panes con queso quiere añadir?"));
                        metodos.añadirPanesConQueso(c);
                    }catch (NumberFormatException e){
                        System.out.println("invalido");
                    }
                    break;

            }
            opcion = (Tipo) JOptionPane.showInputDialog(null, "Seleccione una opcion\n" +
                            "Pulse Cancel para volver",
                    "SimpleMenu", JOptionPane.INFORMATION_MESSAGE, null, opcionesAñadir, opcionesAñadir[2]);
        }
}
}
