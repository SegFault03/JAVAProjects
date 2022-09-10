package JAVAAssignments.Assignments.Assignment2.Q4;

import java.util.Scanner;

public class InvoiceTest {

    public static void updateInvoiceDetails(Invoice ob)
    {
        int ch2;
        char choice;
        Scanner ob2 = new Scanner(System.in);
        showDetails(ob,0);
        System.out.print("Do you want to update details? enter Y for Yes, N for No: ");
        choice = ob2.next().charAt(0);
        if(choice=='N')
            return;
        do {
            System.out.print("Enter 1 for item number, 2 for item description, 3 for item price, 4 for item qty: ");
            ch2 = ob2.nextInt();
            switch (ch2) {
                case 1 -> {
                    ob2.nextLine();
                    System.out.print("Enter part number: ");
                    ob.setPart_number(ob2.nextLine());
                }
                case 2 -> {
                    ob2.nextLine();
                    System.out.print("Enter part description: ");
                    ob.setPart_description(ob2.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter item price: ");
                    ob.setItem_price(ob2.nextDouble());
                }
                case 4 -> {
                    System.out.print("Enter item qty: ");
                    ob.setQty_items(ob2.nextInt());
                }
            }
            showDetails(ob,1);
            System.out.println("Invoice amount is: "+ob.getInvoiceAmount());
            System.out.print("Do you want to update details? enter Y for Yes, N for No: ");
            choice = ob2.next().charAt(0);
        }while (choice=='Y');
    }
    public static void showDetails(Invoice ob, int flag)
    {
        if(flag==0)
            System.out.println("Original Invoice information");
        else
            System.out.println("Updated Invoice information");
        System.out.println("Item Number: "+ob.getPart_number());
        System.out.println("Item Description: "+ob.getPart_description());
        System.out.println("Item Price: "+ob.getItem_price());
        System.out.println("Item Qty: "+ob.getQty_items());
    }

    public static void main(String[] args) {
        String pd,pn;
        double ip;
        int iq,ch = 0,flag=0;
        Scanner scanner = new Scanner(System.in);
        Invoice ob = null;
        do
        {
            System.out.print("Enter part number: ");
            pn=scanner.nextLine();
            System.out.print("Enter part description: ");
            pd= scanner.nextLine();
            System.out.print("Enter item price: ");
            ip=scanner.nextDouble();
            System.out.print("Enter item quantity: ");
            iq= scanner.nextInt();
            if(ob==null)
                ob = new Invoice(pn,pd,iq,ip);
            else
            {
                ob.setQty_items(iq);            //REUSING THE SAME OBJECT
                ob.setPart_number(pn);
                ob.setPart_description(pd);
                ob.setItem_price(ip);
            }
            updateInvoiceDetails(ob);
            System.out.println("Enter 1 to continue, 0 for exit");
            ch = scanner.nextInt();
            scanner.nextLine();
        }while (ch!=0);
    }
}
