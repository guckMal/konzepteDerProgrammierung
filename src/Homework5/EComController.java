package Homework5;

public class EComController {

    public static void main( String [] args) {
        try {
            ShippingInfo info =
                    new ShippingInfo(" Munich", 80331, " Germany ");
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);
            System.out.println(" Shipping to: " +
                    customer.getProfile().getShippingInfo().getCity());
        }
        catch (InvalidShippingInfoException | MissingShippingInfoException | InvalidCustomerException e){
        System.out.println("Exception: "+e.getMessage());
        }
    }
}
