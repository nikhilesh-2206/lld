package WithStatePattern;

public class NavigationServiceV2 {

    protected TransportationMode transportationMode;

    protected NavigationServiceV2(TransportationMode mode)
    {
        this.transportationMode=mode;
    }

    protected void setTransportationMode(TransportationMode transportationMode)
    {
        this.transportationMode=transportationMode;
    }

    public int getEta()
    {
        return transportationMode.getEta();
    }

    public String getDirection()
    {
        return transportationMode.getDirection();
    }
}
