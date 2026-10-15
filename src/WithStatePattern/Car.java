package WithStatePattern;

public class Car implements TransportationMode{

    @Override
    public int getEta() {
        return 20;
    }

    @Override
    public String getDirection() {
        return "car direction";
    }
}
