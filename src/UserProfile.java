public class UserProfile {
    private String name;
    private Offer[] offers;

    public String getName() {
        return this.name;
    }

    public UserProfile(String name) {
        this.name = name;
    }
}
