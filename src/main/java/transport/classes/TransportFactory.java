package transport.classes;

/**
 * Created by olomakovskyi on 9/5/2014.
 */


public class TransportFactory {
    public static Transport getTransport(String transportType) {
        switch (transportType.trim().toLowerCase()) {
            case "coupe":
                return new Coupe();
            case "sedan":
                return new Sedan();
            case "limousine":
                return new Limousine();
            case "truck":
                return new Truck();
            case "bus":
                return new Bus();
            case "trolleybus":
                return new TrolleyBus();
            case "tram":
                return new Tram();
        }
        return null;
    }
}
