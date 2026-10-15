package WithoutStatePattern;

enum TransportMode {
    WALKING,CYCLING,CAR,TRAIN
}
public class NavigationServiceV1 {
    public TransportMode transportMode;
    public NavigationServiceV1(TransportMode transportMode)
    {
        this.transportMode=transportMode;
    }

    public void setTransportMode(TransportMode transportMode)
    {
        this.transportMode=transportMode;
    }

    public String getEta()
    {
        if(transportMode.equals(TransportMode.WALKING))
        {
            return "ETA is 40";
        }
        else if(transportMode.equals(TransportMode.CYCLING))
        {
            return "ETA is 30";
        }
        else if(transportMode.equals(TransportMode.CAR))
        {
            return "ETA is 20";
        }
        else if(transportMode.equals(TransportMode.TRAIN))
        {
            return "ETA is 10";
        }
        else throw new IllegalArgumentException("no such mode");
    }

    public String getDirection()
    {

        if(transportMode.equals(TransportMode.WALKING))
        {
            return "Direction is A";
        }
        else if(transportMode.equals(TransportMode.CYCLING))
        {
            return "Direction is b";
        }
        else if(transportMode.equals(TransportMode.CAR))
        {
            return "Direction is c";
        }
        else if(transportMode.equals(TransportMode.TRAIN))
        {
            return "Direction is d";
        }
        else throw new IllegalArgumentException("no such mode");
    }
}
