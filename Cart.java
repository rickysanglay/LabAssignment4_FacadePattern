public class Cart implements HotelService {

    @Override
    public String getServiceName() {
        return "Cart";
    }

    public void requestCart(int numberOfCarts) {
        System.out.println(getServiceName() + " Service: Dispatched " + numberOfCarts + " luggage cart(s).");
    }
}