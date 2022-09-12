public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("deyner oliver");
        cliente.setEdad(33);
        cliente.setTelefono("+57 3113322258");
        cliente.setCredito(3000000);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    public  void Persona(){
        System.out.println("se ha creado el objeto persona");
    }

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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona{
    private float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }
}
