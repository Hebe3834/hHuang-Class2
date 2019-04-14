public class Account{
  int accountNumber;
  double balance;
  public Account(int n, double b){
    accountNumber=n;
    balance=b;
  }
  public int getaccountNumber(){
    return accountNumber;
  }
  public double getbalance(){
    return balance;
  }
  public void setbalance(double m){
    balance=m;
  }
  public String toString(){
    return "new balance is:"+balance;
  }
}

//https://www3.ntu.edu.sg/home/ehchua/programming/java/images/ClassDiagram_Account.png
