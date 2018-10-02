public class Radio {

    private String station;

    public Radio(){
        this.station = null;
    }

    public String getStation() {
        return station;
    }

    public void tune(String station){
        this.station = station;
    }
}
