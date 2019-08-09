package instruments;

import instruments.EPlayingPosition;
import instruments.ESize;
import instruments.EType;
import instruments.AbstractInstrument;

public class Piano extends AbstractInstrument {

    private int iloscKlawiszy;

    public Piano(int iloscKlawiszy, EPlayingPosition position, EType type, ESize size) {

        super(position, type, size);
        this.iloscKlawiszy = iloscKlawiszy;
    }

    public int getIloscKlawiszy() {
        return iloscKlawiszy;
    }

    public void setIloscKlawiszy(int iloscKlawiszy) {
        this.iloscKlawiszy = iloscKlawiszy;
    }

    @Override
    public int getSounds() {
        return 188;
    }

    @Override
    public boolean canSzarpacStruny() {
        return false;
    }

    @Override
    public String toString() {
        return "Piano has " + iloscKlawiszy + " keys, it is a " + size + " and " + type + " instrument and a person plays it in a " + position + " position.";

    }
}
 /*Flute has 8 holes, it is a SMALL and DĘTY instrument and a person plays it in a SIT_OR_STAND position.
Czy da się szarpać mu struny? false
Bez kombinowania można na nic zagrać 23 dźwięków

Guitar has 6 strings, it is a MEDIUM and STRUNOWY instrument and a person plays it in a SIT_OR_STAND position.
Czy da się szarpać mu struny? true
Bez kombinowania można na nic zagrać 53 dźwięków

Violin has 4 strings, it is a SMALL and STRUNOWY instrument and a person plays it in a SIT_OR_STAND position.
Czy da się szarpać mu struny? true
Bez kombinowania można na nic zagrać 44 dźwięków

Piano has 88 keys, it is a BIG and KLAWISZOWY instrument and a person plays it in a SIT position.
Czy da się szarpać mu struny? false
Bez kombinowania można na nic zagrać 188 dźwięków

  */