class User{
  public String userid = "ME";
  public String password = "ME246";
  public double registerDate = 5.10;
  public void Login(){
    System.out.println("Logged in");
  }
}
class Administrator extends User{
  public String name = "Robert";
  public String email = "robert@email.com";
  public void updateProducts(){
    System.out.println("Updated");
  }
}
class Customer extends User{
  public String name = "HEBE";
  public String address = "New York";
  public String email = "hhuang20@stuy.edu";
  public String customerId = "3834";
  public double accountBalance = 0.77;
  public void register(){
    System.out.println("Welcome, " + name);
  }
  public void purchase(){
    System.out.println("Purchased");
  }
}
class Order extends Customer{
  public String orderid = "QWERTY1";
  public double Date = 2.30;
  public String customerName = "HEBE";
  public String customerId = "3834";
  public void placeOrder(){
    System.out.println("Order placed");
  }
}
class OrderDetails extends Order{
  public String orderId = "0001";
  public String productId = "112233";
  public String productName = "GLoves";
  public int quantity = 2;
  public double unitCost = 0.35;
  public double total = quantity*unitCost;
  public void calculateTotal(){
    System.out.println(total);
  }
}
