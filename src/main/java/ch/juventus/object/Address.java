package ch.juventus.object;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
            Objects.equals(number, address.number) &&
            Objects.equals(zip, address.zip) &&
            Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(street, number, zip, city);
    }
}
