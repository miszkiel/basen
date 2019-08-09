package parkZeStawikiem;

public class Kosz {
    private String kolor;
    private String material;
    private int rozmiar;


    public Kosz(String kolor, String material, int rozmiar) {
        this.kolor = kolor;
        this.material = material;
        this.rozmiar = rozmiar;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    public int getRozmiar(){
        return rozmiar;
    }
    public void setRozmiar(int rozmiar){
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString(){
        return kolor;
    }
}
