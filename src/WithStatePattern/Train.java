package WithStatePattern;

public class Train implements TransportationMode{

    @Override
    public int getEta() {
        return 10;
    }

    @Override
    public String getDirection() {
        return "train direction";
    }
}
