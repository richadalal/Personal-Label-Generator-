// Richa Dalal 

import java.util.Scanner;

public class Main
{ 
public static void main(String[] args)   

  { 
    Scanner sc= new Scanner(System.in);
    String name; 
    String address;
    String city; 
    String postal;
    String country;
    while (true)
    {
      System.out.println("Please fill in some important information below");
      System.out.println("Name:");
      name = sc.nextLine();
      System.out.println("Address:");
      address = sc.nextLine();
      System.out.println("City:");
      city = sc.nextLine();
      System.out.println("Postal Code:");
      postal = sc.nextLine();
      System.out.println("Country:");
      country = sc.nextLine();
      System.out.println("Name: " + name);
      System.out.println("Address: " + address);
      System.out.println("City: " + city);
      System.out.println("Postal Code: " + postal);
      System.out.println("Country: " + country);
    }
}
}
