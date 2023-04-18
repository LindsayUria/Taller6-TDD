package ucb.edu.bo.taller6tdd;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ElevadorTest {
    private Elevador elevador;

    @Before
    public void before(){
        elevador=new Elevador();
    }

    //El ascensor al comenzar el día espera con su puerta cerrada en el primer piso del edificio
    @Test
    public void inicioDiaPuertaCerrada() throws Exception {
        //1 preparacion de la prueba

        //2 logica de la prueba

        //3 Verificacion de la prueba
        assertEquals("Cerrado",elevador.puerta());
    }

    //El programa debe tener una función para “Crear persona”, cuando se invoque a esta función,
    //el programa deberá crear una persona y colocarla en un piso.

    @Test
    public void crearPersonaPisoAleatorio() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        //2 logica de la prueba
        persona.crearPersona();
        //3 Verificacion de la prueba
        switch (persona.getPiso()){
            case(1):
                assertEquals(1, persona.getPiso());
                break;
            case(2):
                assertEquals(2, persona.getPiso());
                break;
            default:
                assertEquals(3, persona.getPiso());
        }
    }

    //La persona deberá oprimir el botón de llamada del piso.
    @Test
    public void llamadaDePiso() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba

        //3 Verificacion de la prueba
        assertEquals(persona.getPiso(), elevador.llamar(persona));
    }

    //El piso de destino de la persona nunca es igual al piso en el que se crea esa persona.
    @Test
    public void pisoDestinoPersonaNoIgual() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba

        //3 Verificacion de la prueba
        assertNotEquals(persona.getPiso(),persona.getDestino());
    }

    //Llega el Ascensor
    @Test
    public void pisoDestinoPersonaLLegando() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba
        elevador.llamar(persona);
        //3 Verificacion de la prueba
        assertEquals(persona.getDestino(), elevador.destino(persona));
    }

    //Si la primera persona del día aparece en el piso 1, puede subirse de
    //inmediato al ascensor (después de presionar el botón de llamada).
    // Si la primera persona aparece en el piso 2, el elevador deberá dirigirse
    // al piso 2 y recoger a la persona. El ascensor siempre sabe en que piso esta
    // y cual es su piso de destino
    @Test
    public void variasPersonasPidenAscensor() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba
        elevador.llamar(persona);
        //3 Verificacion de la prueba
        assertEquals(persona.getDestino(), elevador.destino(persona));
        Persona persona2=new Persona();
        persona2.crearPersona();
        elevador.llamar(persona2);
        assertEquals(persona2.getDestino(), elevador.destino(persona2));
        Persona persona3=new Persona();
        persona3.crearPersona();
        elevador.llamar(persona3);
        assertEquals(persona3.getDestino(), elevador.destino(persona3));
    }

}
