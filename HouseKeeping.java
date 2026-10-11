public class HouseKeeping implements HotelService {

    @Override
    public String getServiceName() {
        return "HouseKeeping";
    }

    public void cleanRoom(String roomNumber) {
        System.out.println(getServiceName() + ": Room " + roomNumber + " has been cleaned.");
    }
}