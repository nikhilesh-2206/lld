package WithStatePattern;

public class main {

    public static void main(String[] args) {
        NavigationServiceV2 navigationServiceV2 = new NavigationServiceV2(new Cycle());

        navigationServiceV2.setTransportationMode(new Walk());
        System.out.println(navigationServiceV2.getDirection());
        System.out.println(navigationServiceV2.getEta());



    }
}
