package WithoutStatePattern;

public class main {
    public static void main(String[] args) {

        NavigationServiceV1 navigationServiceV1 = new NavigationServiceV1(TransportMode.CAR);
        navigationServiceV1.setTransportMode(TransportMode.CYCLING );
        System.out.println(navigationServiceV1.getDirection());
        System.out.println( navigationServiceV1.getEta());
    }
}
