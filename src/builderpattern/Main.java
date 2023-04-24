public class Main {

  public static void main(String[] args) {
    User user1 = new User.UserBuilder("Pramod", "Yadav").age(30)
        .address("Bangalore")
        .phone("12345")
        .build();

    System.out.println(user1);

    User user2 = new User.UserBuilder("Pramod", "Yadav").age(30)
        .phone("12345")
        .build();
    System.out.println(user2);

  }
}