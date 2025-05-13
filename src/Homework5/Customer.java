package Homework5;

public class Customer {
    private Profile profile;
    private int id;

    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if(profile==null || id<0){
            throw new InvalidCustomerException("Profile missing or ID is negative");
        }
        this.profile = profile;
        this.id = id;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public int getId() {
        return id;
    }
}
