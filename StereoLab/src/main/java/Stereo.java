public class Stereo {

    private CdPlayer cdPlayer;
    private Radio radio;
    private RecordDeck recordDeck;
    private CassettePlayer cassettePlayer;

    public Stereo(CdPlayer cdPlayer, Radio radio, RecordDeck recordDeck, CassettePlayer cassettePlayer) {
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cassettePlayer = cassettePlayer;
    }

    public Radio getRadio() {
        return radio;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void tuneRadio(String station){
        this.radio.tune(station);
    }

    public void playCD(String name){
        this.cdPlayer.play(name);
    }
}
