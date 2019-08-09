package instruments;

import instruments.Flute;
import instruments.Guitar;
import instruments.Violin;
import instruments.Piano;

public class MainInstruments {

    public static void main(String[] args) {

        Flute flute = new Flute(8,EPlayingPosition.SIT_OR_STAND,EType.DĘTY,ESize.SMALL);
        System.out.println(flute);
        System.out.println("Czy da się szarpać mu struny? "+flute.canSzarpacStruny());
        System.out.println("Bez kombinowania można na nic zagrać "+flute.getSounds()+" dźwięków");
        System.out.println();

        Guitar guitar = new Guitar(6,EPlayingPosition.SIT_OR_STAND,EType.STRUNOWY,ESize.MEDIUM);
        System.out.println(guitar);
        System.out.println("Czy da się szarpać mu struny? "+guitar.canSzarpacStruny());
        System.out.println("Bez kombinowania można na nic zagrać "+guitar.getSounds()+" dźwięków");
        System.out.println();

        Violin violin= new Violin(4,EPlayingPosition.SIT_OR_STAND,EType.STRUNOWY,ESize.SMALL);
        System.out.println(violin);
        System.out.println("Czy da się szarpać mu struny? "+violin.canSzarpacStruny());
        System.out.println("Bez kombinowania można na nic zagrać "+violin.getSounds()+" dźwięków");
        System.out.println();

        Piano piano = new Piano(88,EPlayingPosition.SIT,EType.KLAWISZOWY,ESize.BIG);
        System.out.println(piano);
        System.out.println("Czy da się szarpać mu struny? "+piano.canSzarpacStruny());
        System.out.println("Bez kombinowania można na nic zagrać "+piano.getSounds()+" dźwięków");
        System.out.println();


    }



}
