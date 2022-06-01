public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Sara");
        cliente.setTelefono(666222111);
        cliente.setCredito(200);

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(1200);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad() + " años");
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
        System.out.println("Credito solicitado: " + cliente.getCredito());

    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {

    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

final class Trabajador extends Cliente {

    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;

    }

    public int getSalario() {
        return this.salario;
    }

}
