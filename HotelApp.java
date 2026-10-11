public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValetPickup("NCE-1234");
        frontDesk.requestRoomCleaning("1205");
        frontDesk.requestLuggageCarts(2);

        frontDesk.requestValetPickup("NCE-1234");
    }
}