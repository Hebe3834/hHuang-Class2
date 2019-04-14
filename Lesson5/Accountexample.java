public class Accountexample{
  public static void main(String[]args){
    Account Account1=new Account(8747, 0.23);
    System.out.println(Account1.getaccountNumber());
    System.out.println(Account1.getbalance());
    Account1.setbalance(10.0);
    System.out.println(Account1);
  }
}
