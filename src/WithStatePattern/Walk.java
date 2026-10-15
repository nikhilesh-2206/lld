package WithStatePattern;

public class Walk implements TransportationMode{
    @Override
    public int getEta() {
        return 40;
    }

    @Override
    public String getDirection() {
        return "walk direction";
    }
}
