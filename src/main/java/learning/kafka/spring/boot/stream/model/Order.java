package learning.kafka.spring.boot.stream.model;
public class Order {
  private Address address;
  private Long ordertime;
  private int orderid;
  private String itemid;

  public Order(
      final Address address,
      final Long ordertime,
      final int orderid,
      final String itemid
  ) {
    this.address = address;
    this.ordertime = ordertime;
    this.orderid = orderid;
    this.itemid = itemid;
  }

  public Order() {
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public Long getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(final Long ordertime) {
    this.ordertime = ordertime;
  }

  public int getOrderid() {
    return orderid;
  }

  public void setOrderid(final int orderid) {
    this.orderid = orderid;
  }

  public String getItemid() {
    return itemid;
  }

  public void setItemid(final String itemid) {
    this.itemid = itemid;
  }
}
