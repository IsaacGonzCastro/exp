package applibreta;

/**
 * Aquí están en los metodos y objectos referidos a la libreta para añadir un
 * contacto y saber si hay sitio para añadirlo.
 *
 * @author igonzalezcastro
 * @version 2.1
 */
public class Libreta {

    private String nombre, dni;
    private int libre = cualLibre();
    Contacto[] arrayContactos = new Contacto[3];

    public Libreta() {
        nombre = dni = "";
    }

    public Libreta(String aux_nombre, String aux_dni) {
        this.nombre = aux_nombre;
        this.dni = aux_dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void engadir() {
        libre = cualLibre();
        if (libre > 0) {
            System.out.println("Introduzca nombre");
            arrayContactos[libre].setNombre(nombre);
        }
    }

    public int cualLibre() {
        for (int libre = 0; libre < arrayContactos.length; libre++) {
            if (arrayContactos[libre].getNombre().equals("")) {
                System.out.println("Hay hueco");
                return libre;
            } else if (libre == arrayContactos.length) {
            }
        }
        return -1;
    }

    public void metodoPrueba() {

    }
}
