/**
 * Creates user info objects and prints information about the users.
 *
 * Activity 4
 * @author Devin Trowbridge CPSC-1213-AO1
 * @version 2020-06-013
 */
public class UserInfoDriver {
 
   /**
    * Creates user info objects and prints information about the users.
    *
    * @param args Command line arguments - not used
    */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}