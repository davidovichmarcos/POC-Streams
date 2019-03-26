public class Persona {

    private String name;
    private Integer dni;
    private Integer edad;

    public Persona(String name, Integer dni, Integer edad) {
        this.name = name;
        this.dni = dni;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
