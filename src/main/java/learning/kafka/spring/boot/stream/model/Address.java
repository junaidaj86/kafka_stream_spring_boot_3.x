package learning.kafka.spring.boot.stream.model;

public class Address {
  private String city;
  private String state;
  private String zipcode;

  public Address(final String city, final String state, final String zipcode) {
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

  public Address() {}

  public String getCity() {
    return city;
  }

  public void setCity(final String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(final String zipcode) {
    this.zipcode = zipcode;
  }
}
