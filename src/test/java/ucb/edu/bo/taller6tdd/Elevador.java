package ucb.edu.bo.taller6tdd;

public class Elevador {
    private boolean puerta=false;
    private boolean ocupado=false;
    private int piso=1;

    public String puerta(){
        if(puerta)
            return "Abierto";
        else
            return "Cerrado";
    }

    public int llamar(Persona per){
        if(per.getPiso()==piso){
            System.out.println("Ascensor ya esta en el piso: "+piso);
            return piso;
        }
        if(per.getPiso()==1){
            piso=1;
            puerta=true;
            System.out.println("Ascensor llego al piso: "+piso);
            return 1;
        }else if (per.getPiso()==2) {
            piso=2;
            puerta=true;
            System.out.println("Ascensor llego al piso: "+piso);
            return 2;
        }else{
            piso=3;
            puerta=true;
            System.out.println("Ascensor llego al piso: "+piso);
            return 3;
        }
    }

    public int destino(Persona per) throws Exception {
        if(piso!=per.getPiso()){
            throw new Exception("El piso del ascensor "+piso + " no es el mismo de la persona "+per.getPiso());
        }
        puerta=false;
        ocupado=true;
        System.out.println("Asensor ocupado en piso: "+piso);
        piso= per.getDestino();
        System.out.println("Asensor desocupado en piso: "+piso);
        return piso;
    }
}
