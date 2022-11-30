import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Este programa nos crear un alumno y validar que los datos introducidos corresponda al tipo de dato que se pide");
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el nombre del alumno");
        String nombre = entrada.readLine();
        alumno alumno = new alumno();
        alumno.Cadena(nombre);
        System.out.println("Introduzca la matricula del alumno");
        String matricula = entrada.readLine();
        alumno.Int(matricula);
        System.out.println("introduzca el promedio del alumno");
        String promedio = entrada.readLine();
        alumno.Float(promedio);
        System.out.println(alumno);
    }
}