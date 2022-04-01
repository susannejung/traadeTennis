package FilEksempler;

public class Main {

    public static void main( String[] argv ) {

        TennisSpiller spillerA = new TennisSpiller( "Andre Agassi" );
        TennisSpiller spillerB = new TennisSpiller( "Lleyton Hewitt" );

        spillerA.setModstander( spillerB );
        spillerB.setModstander( spillerA );

        spillerA.start();
        spillerB.start();

        spillerA.modtagBold();
    }
}