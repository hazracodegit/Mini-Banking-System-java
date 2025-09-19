import java.util.*;
public class BankingSystem {
   
       static int[] accountNumbers ={123,234,345,456,567,678,789,890,235,457};
       static int[] pinNumbers={10,20,30,40,50,60,70,80,90,100};
       static int[] balances={0,0,0,0,0,0,0,0,0,0};
       static int balance=0;
       static int index=0;
       static int index1=0;
      static List<String> lst=new ArrayList<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
         index=0;
        System.out.println("Welcome to the Banking System");
        System.out.println("Enter your account number");
        int account_no=sc.nextInt();
        for(int i=0;i<accountNumbers.length;i++){
            if (account_no==accountNumbers[i]){
                index=i;
            System.out.println("Account Number Found");
            flag=true;
            break;
            }
        }
        if (flag==false)
        System.out.println("Invalid Account Number");
        if(flag){
        System.out.println("Enter your Pin number");
        int pin_no=sc.nextInt();
        boolean flag1=false;
        for(int i=0;i<pinNumbers.length;i++){
            if (pinNumbers[i]==pin_no){
            System.out.println("Login Success");
            flag=true;
            break;
            }
        }
        if (flag==false)
        System.out.println("Invalid Pin Number");
        while(true){
            System.out.println("Menu Options:");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Transfer Money");
            System.out.println("5.Change PIN");
            System.out.println("6.View Past Few Transactions");
            System.out.println("7.Exit");
            System.out.println("Enter your choice from the above menu Options");
            int choice=sc.nextInt();
            if (choice==1)
            checkBalance(index);
            else if (choice==2)
            depositMoney();
            else if (choice==3)
            withdrawMoney();
            else if (choice==4)
            transferMoney();
            else if (choice==5)
            changePin();
            else if (choice==6)
            viewTransactions();
            else{
                System.out.println("Output is successfull:");

            break;
            }
        }
    }

}
     static void checkBalance(int index){
        System.out.print("Your remaining Balance:");
        System.out.println(balances[index]);



     }
     static void depositMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited:");
        int amount=sc.nextInt();
        balances[index]=balances[index]+amount;
        System.out.println(amount+"is successfully deposited");
        lst.add("Deposited: Rs: "+amount);

     }
     static void transferMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be transferred:");
        int amount=sc.nextInt();
        System.out.println("Enter the account number to be transfered");
        accountNumbers[3]=amount;
        balances[index]=balances[index]-amount;



     }
     static void withdrawMoney(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of money to be withdrawed:");
        int amount=sc.nextInt();
        if (amount<balances[index]){
        balances[index]=balances[index]-amount;
        System.out.println(amount+"is successfully withdrawed");
        lst.add("Withdrew: Rs: "+amount);
        }
        else
        System.out.println("Insufficient balance");


     }
     static void changePin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the new Pin to be changed:");
        int new_pin=sc.nextInt();
        pinNumbers[index]=new_pin;

     
    }
    static void viewTransactions(){
        for(String s : lst)
        System.out.println(s);

    }


    
}
