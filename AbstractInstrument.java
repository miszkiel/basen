package instruments;

import instruments.EPlayingPosition;
import instruments.ESize;
import instruments.EType;

public abstract class AbstractInstrument {

    protected EPlayingPosition position;
    protected ESize size;
    protected EType type;

    public AbstractInstrument(EPlayingPosition position, EType type, ESize size){
        this.position = position;
        this.size = size;
        this.type = type;
    }

    public EPlayingPosition getPosition(){
        return position;
    }
    public void setPosition(EPlayingPosition position){
        this.position = position;
    }

    public EType getType(){
        return type;
    }
    public void setType(EType type){
        this.type = type;
    }

    public ESize getSize(){
        return size;
    }
    public void setSize(ESize size){
        this.size = size;
    }

    public abstract int getSounds();
    public abstract boolean canSzarpacStruny();


}
