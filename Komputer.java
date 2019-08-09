package konstruktory;

public class Komputer {
    private Procesor procesor;

    public Komputer(){
        System.out.println("Komputer uruchomiony");
        this.procesor = new Procesor();


    }
}
