package ch.juventus.object;

public class Address {

    private String street;
    private String number;
    private String zip;
    private String city;

    public Address(String street, String number, String zip, String city) {
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
            "street='" + street + '\'' +
            ", number='" + number + '\'' +
            ", zip='" + zip + '\'' +
            ", city='" + city + '\'' +
            '}';
    }
}
