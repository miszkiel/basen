package instruments;

import instruments.EPlayingPosition;
import instruments.ESize;
import instruments.EType;
import instruments.AbstractInstrument;

public class Guitar extends AbstractInstrument{

    private int iloscStrun;

    public Guitar(int iloscStrun, EPlayingPosition position, EType type, ESize size){
        super(position, type,size);
        this.iloscStrun = iloscStrun;
    }

    public double getIloscStrun(){
        return iloscStrun;
    }
    public void setIloscStrun(int iloscStrun){
        this.iloscStrun = iloscStrun;
    }

    @Override
    public int getSounds(){
        return 53;
    }

    @Override
    public boolean canSzarpacStruny(){
        return true;
    }
    @Override
    public String toString(){
        return "Guitar has " + iloscStrun + " strings, it is a " + size + " and " + type + " instrument and a person plays it in a " + position + " position.";
    }}
