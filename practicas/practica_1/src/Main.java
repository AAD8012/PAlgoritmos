import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void Cadena(String cad) {
        if (!cad.isEmpty()) {
            if ((cad.length() > 1)) {
                System.out.println("Es de tipo String");
            } else {
                System.out.println("No es de tipo String");
            }
        } else {
            System.out.println("no se introdujo nada");
        }
    }


    public static void Char(String cad) {
        if (!cad.isEmpty()) {
            if ((cad.length() > 1)) {
                System.out.println("No es de tipo Caracter");

            } else {
                System.out.println("Es de tipo Caracter");
            }
        } else {
            System.out.println("no se introdujo nada");
        }
    }

//    public static boolean Float(String cad) {
//        if (!cad.isEmpty()) {
//            try {
//                return cad.matches("^-?[\\d+]?.\\d+");
//            } catch (NumberFormatException e) {
//                System.err.println("Error");
//            }
//        }
//        return false;
//    }


    public static boolean Float(String cad) {
        if (!cad.isEmpty()) {
            try {
                return !cad.matches("^-?[\\d+]?.\\d+");
            } catch (NumberFormatException e) {
                System.err.println("Error");
            }
        }
        return false;
    }

    public static boolean Int(String cad) {
        if (!cad.isEmpty()) {
            try {
                return cad.matches("^-?\\d+");
            } catch (NumberFormatException e) {
                System.err.println("Error");
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Este programa nos ayuda a validar, si lo que introducimos por teclado es lo que nos pide que introduzcamos");
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int opciones = 0;
        int salir = 0;
        do {
            System.out.println("1.- Comprobar si lo introducido es de tipo String");
            System.out.println("2.- Comprobar si lo introducido es de tipo Caracter");
            System.out.println("3.- Comprobar si lo introducido es de tipo Entero");
            System.out.println("4.- Comprobar si lo introducido es de tipo Flotante");
            System.out.println("5.- Salir del programa");

            opciones = Integer.parseInt(entrada.readLine());
            switch (opciones) {
                case 1:
                    System.out.println("Introduzca un String");
                    String cadena = "";
                    cadena = entrada.readLine();
                    Cadena(cadena);
                    break;
                case 2:
                    System.out.println("Introduzca un caracter");
                    String caracter = "";
                    caracter = entrada.readLine();
                    Char(caracter);
                    break;
                case 3:
                    System.out.println("Introduzca un numero entero");
                    String Int = "";
                    Int = entrada.readLine();
                    System.out.println("Es de tipo numero: " + Int(Int));
                    break;
                case 4:
                    System.out.println("Introduzca un numero flotante");
                    String Float = "";
                    Float = entrada.readLine();
                    System.out.println("Es de tipo flotante :"+Float(Float));;
                    break;
                case 5:
                    salir = 10;
                    break;
            }

        } while (salir != 10);
    }
}