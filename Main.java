import java.util.*;

public class Main{
    public static void main(String args[]) {
        System.out.println("Enter the details of the user: ");
        Scanner sc = new Scanner(System.in);

        bankuser bu = new bankuser();
        System.out.println("Enter account holder name: ");
        bu.holdname = sc.next();
        
        System.out.println("Here is the account number:");
        Random ai = new Random();
        bu.accountnumber = ai.nextInt(2000);

        System.out.println("Enter the account type: ");
        bu.accounttype = sc.next();
        
        System.out.println("Enter the branch name: ");
        bu.branchname = sc.next();
        
        System.out.println("Enter your IFC code: ");
        bu.ifc = sc.nextInt();
        
        System.out.println("Enter the bank name: ");
        bu.bankname = sc.next();
        
        System.out.println("Enter the bank balance of the user: ");
        bu.bankbalance = sc.nextInt();

        boolean input = false;

        while (!input) {
            int i;

            System.out.println("\nHere are the options to select to run the operations:");
            System.out.println("Select 1 for credit");
            System.out.println("Select 2 for debit");
            System.out.println("Select 3 for account details");
            System.out.println("Select 4 for bank balance");
            System.out.println("Select 5 for account ID");
            System.out.println("Select 6 to quit the process");

            System.out.print("Enter the option to select: ");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    bu.credit(sc);
                    break;
                case 2:
                    bu.debit(sc);
                    break;
                case 3:
                    bu.accountdetails();
                    break;
                case 4:
                    bu.showBankBalance();
                    break;
                case 5:
                    bu.accountid();
                    break;
                case 6:
                    input = true;
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Enter a valid number (1 to 6).");
            }
        }

    }
}

class bankuser {
    String holdname;
    String accounttype;
    int accountnumber;
    String branchname;
    int ifc;
    String bankname;
    int bankbalance;

    public void credit(Scanner sc) {
        System.out.print("Enter the number you want to add: ");
        int j = sc.nextInt();
        this.bankbalance += j;
        System.out.println("Here is your new balance: " + bankbalance);
    }

    public void debit(Scanner sc) {
        System.out.print("Enter the number you want to remove: ");
        int j = sc.nextInt();
        if (j > bankbalance) {
            System.out.println("Insufficient balance. Transaction cancelled.");
        } else {
            this.bankbalance -= j;
            System.out.println("Here is your new balance: " + bankbalance);
        }
    }

    public void accountdetails() {
        System.out.println("\nHere are the details of the user account:");
        System.out.println("Account Number : " + this.accountnumber);
        System.out.println("Account Type   : " + this.accounttype);
        System.out.println("Holder Name    : " + this.holdname);
        System.out.println("Bank Name      : " + this.bankname);
        System.out.println("Branch Name    : " + this.branchname);
        System.out.println("IFC Code       : " + this.ifc);
        System.out.println("Bank Balance   : " + this.bankbalance);
    }

    public void showBankBalance() {
        System.out.println("Current Bank Balance: " + this.bankbalance);
    }

    public void accountid() {
        System.out.println("Account ID: " + this.accountnumber);
    }
}
