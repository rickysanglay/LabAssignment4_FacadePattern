public class Valet implements HotelService {

    @Override
    public String getServiceName() {
        return "Valet";
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println(getServiceName() + ": Vehicle with plate " + plateNumber + " is ready at the entrance.");
    }
}