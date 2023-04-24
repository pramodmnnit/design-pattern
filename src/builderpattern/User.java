public class User {

  private final String firstName;
  private final String lastName;
  private final Integer age;
  private final String phone;
  private final String address;

  public User(UserBuilder userBuilder) {
    this.firstName = userBuilder.firstName;
    this.lastName = userBuilder.lastName;
    this.age = userBuilder.age;
    this.phone = userBuilder.phone;
    this.address = userBuilder.address;
  }

  @Override
  public String toString() {
    return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
  }

  public static class UserBuilder {

    private final String firstName;
    private final String lastName;
    private Integer age;
    private String phone;
    private String address;

    public UserBuilder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public UserBuilder age(Integer age) {
      this.age = age;
      return this;
    }

    public UserBuilder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}