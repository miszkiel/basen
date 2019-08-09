package instruments;

import instruments.EPlayingPosition;
import instruments.ESize;
import instruments.EType;
import instruments.AbstractInstrument;

public class Flute extends AbstractInstrument{

    private int iloscDziur;

    public Flute(int iloscDziur, EPlayingPosition position, EType type, ESize size){
        super(position, type, size);
        this.iloscDziur = iloscDziur;
    }

    public double getIloscDziur(){
        return iloscDziur;
    }
    public void setIloscDziur(int iloscDziur){
        this.iloscDziur = iloscDziur;
    }

    @Override
    public int getSounds(){
        return 23;
    }

    @Override
    public boolean canSzarpacStruny(){
        return false;
    }

    @Override
    public String toString(){
        return "Flute has "+iloscDziur+" holes, it is a "+size+" and " +type+ " instrument and a person plays it in a "+position+" position.";
    }
}
