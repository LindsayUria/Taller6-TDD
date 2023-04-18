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

        //3 Verificacion de la preba
        assertEquals("Cerrado",elevador.puerta());
    }

}
