public class alumno {
    private String Nombre;
    private String matricula;
    private String promedio;

    public alumno() {
    }

    public alumno(String nombre, String matricula, String promedio) {
        Nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public void Cadena(String cad) {
        if (!cad.isEmpty()) {
            if ((cad.length() > 1)) {

                setNombre(cad);
            } else {
                System.out.println("No es de tipo String");
            }
        } else {
            System.out.println("no se introdujo nada");
        }
    }


    public void Char(String cad) {
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


    public boolean Float(String cad) {
        if (!cad.isEmpty()) {
            try {
                setPromedio(cad);
                return !cad.matches("^-?[\\d+]?.\\d+");

            } catch (NumberFormatException e) {
                System.err.println("Error");
            }
        }
        return false;
    }

    public boolean Int(String cad) {
        if (!cad.isEmpty()) {
            try {
                setMatricula(cad);
                return cad.matches("^-?\\d+");
            } catch (NumberFormatException e) {
                System.err.println("Error");
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "Nombre='" + Nombre + '\'' +
                ", matricula=" + matricula +
                ", promedio=" + promedio +
                '}';
    }
}

