package WithStatePattern;

public class Cycle implements TransportationMode{

    @Override
    public int getEta() {
        return 30;
    }

    @Override
    public String getDirection() {
        return "cycle direction";
    }
}
