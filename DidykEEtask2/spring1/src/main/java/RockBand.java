import java.util.Collection;

public class RockBand implements Performer{
    public RockBand(){}
    public void perform(){
        for (Instrument instrument:instruments){
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }
}
