package parkZeStawikiem;

public class Main {

    public static void main(String[] args){

        Park park = new Park("Moczydło", "non-stop");

        Alejka alejka1 = new Alejka( "Lawendowa", 1 );
        Alejka alejka2 = new Alejka( "Rózana", 2 );
        Alejka alejka3 = new Alejka( "Jaśminowa",3 );
        Alejka alejka4 = new Alejka( "Stu pocałunków", 4 );

        Kosz kosz1 = new Kosz( "brązowy", "metalowy", 100 );
        Kosz kosz2 = new Kosz( "czerwony", "drewniany", 50 );

        Lawka lawka1 = new Lawka( "biały", 4, true );
        Lawka lawka2 = new Lawka( "zielony", 5, true );
        Lawka lawka3 = new Lawka( "niebieski", 3 , false);
        Lawka lawka4 = new Lawka( "zielony", 4, true );
        Lawka lawka5 = new Lawka( "pstrokaty", 2, false );

        Staw staw = new Staw( "Żabi Staw", "6:00-22:00" );



        alejka1.setKosz( kosz1 );
        alejka1.setLawka( lawka1 );
        alejka1.setLawka( lawka2 );
        alejka2.setKosz( kosz2 );
        alejka3.setLawka( lawka3 );
        alejka3.setLawka( lawka4 );
        alejka3.setLawka( lawka5 );

        park.setAlejkas( new Alejka[] {alejka1, alejka2, alejka3, alejka4 } );

        park.setStaw( staw ) ;
        staw.setPark(park);

        System.out.println( park );


    }
}
