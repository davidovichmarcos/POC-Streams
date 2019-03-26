import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class main {

    public static void main (String args[])
    {
        List<Persona> personas = new ArrayList<>();
        //Arrays.asList().add(new Persona("marcos","39966575",22), new Persona("","",10));
        personas.add(new Persona("marcos",39966575,22));
        personas.add(new Persona("young",20155511,10));
        personas.add(new Persona("old",10000000,65));
        personas.add(new Persona("twenty",39966585,20));

        List<Persona> olders = getOldersThan21(personas);
        List<Persona> youngers = getYoungersThan18(personas);
        List<Persona> morethan2millon = getOldersThan21AndForeigners(personas);

    }

    public static List<Persona> getOldersThan21(List<Persona> personas)
    {
        List<Persona>  olders = personas.stream()
                .filter(Persona -> Persona.getEdad() > 21)
                .collect(Collectors.toList());
        return olders;
    }

    public static List<Persona> getYoungersThan18(List<Persona> personas)
    {
        List<Persona>  youngers = personas.stream()
                .filter(Persona -> Persona.getEdad() < 18)
                .collect(Collectors.toList());
        return youngers;
    }

    public static List<Persona> getOldersThan21AndForeigners(List<Persona> personas )
    {
        List<Persona>  olders = personas.stream()
                .filter(Persona -> Persona.getEdad() > 21)
                .filter(Persona -> Persona.getDni()>20000000)
                .collect(Collectors.toList());
        return olders;
    }
}