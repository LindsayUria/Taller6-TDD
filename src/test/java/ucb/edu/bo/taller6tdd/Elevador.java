package ucb.edu.bo.taller6tdd;

public class Elevador {
    private boolean puerta=false;
    private boolean ocupado=false;

    public String puerta(){
        if(puerta)
            return "Abierto";
        else
            return "Cerrado";
    }
}
