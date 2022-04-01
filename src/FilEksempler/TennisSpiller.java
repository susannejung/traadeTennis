package FilEksempler;

public class TennisSpiller extends Thread {
    private String navn;
    private boolean harBold;
    public boolean ilive;

    private TennisSpiller modstander;

    public TennisSpiller( String navn ) {
        this.navn = navn;

        harBold = false;
        ilive=true;

    }

    public void setModstander( TennisSpiller modstander ) {
        this.modstander = modstander;
    }

    public void modtagBold() {
        harBold = true;
    }

    public void run() {
        while ( this.ilive==true && this.modstander.ilive==true) {
          while ( !harBold ) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                sleep(1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if ( Math.random() > 0.20 ) {
                System.out.println( navn + " returnerer bolden" );
                harBold = false;
                modstander.modtagBold();
            } else {
                System.out.println( navn + " missede bolden" );
                ilive=false;
                this.modstander.ilive=false;
                break;
            }
        }
     System.exit(1);
    }
}
