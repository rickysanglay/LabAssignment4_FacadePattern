public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public FrontDesk(Valet valet, HouseKeeping houseKeeping, Cart cart) {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void requestValetPickup(String plateNumber) {
        if (plateNumber == null || plateNumber.isBlank()) {
            System.out.println("FrontDesk: Please provide a valid plate number.");
            return;
        }
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(String roomNumber) {
        if (roomNumber == null || roomNumber.isBlank()) {
            System.out.println("FrontDesk: Please provide a valid room number.");
            return;
        }
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestLuggageCarts(int count) {
        if (count <= 0) {
            System.out.println("FrontDesk: Please request at least one cart.");
            return;
        }
        cart.requestCart(count);
    }
}