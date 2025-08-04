package coe318.lab4;


public class Account {

    private String name;
    private int accNumber;
    private double accountBalance;
 
public Account(String name, int number,double initialBalance) {
        this.name = name;
        accNumber = number;
        this.accountBalance = initialBalance;
    }
    
    //GetName method
    public String getName(){
        return name;
    }
    //GetName method
    public int getNumber(){
        return accNumber;
    }
    //GetName method
    public double getBalance(){
        return accountBalance;
    }
    
    public boolean deposit(double value){
        if(value<=0){
          //  System.out.println("Deposit value must be greater than 0");
            return false;
        }
        else{
          //  System.out.println("Deposit has been succesful");
            accountBalance+=value;
            return true;
        }
    }
    
    public boolean withdraw(double value){
      if(value<=0 || value>=accountBalance){
         // System.out.println("Withdrawl value must be greater than 0 or less than account balance");
          return false;
      }
      else{
         // System.out.println("Withdrawl has been succesful");
          accountBalance-=value;
          return true;
      }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
    return "(" + getName() + ", " + getNumber() + ", " +
    String.format("$%.2f", getBalance()) + ")";
    } 
}


    