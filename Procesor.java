package konstruktory;

public class Procesor {

    private PamiecRam pamiecRam;
    private DyskTwardy dyskTwardy = new DyskTwardy();


    public Procesor(){
        System.out.println("Procesor uruchomiony");
        this.pamiecRam = new PamiecRam();
    }
}
