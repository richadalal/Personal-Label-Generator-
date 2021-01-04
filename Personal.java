//Richa Dalal
import hsa.Console;
import java.awt.*;
import java.util.*;
import javax.imageio.*;
import java.io.*;

public class Personal
{ static Console c;
  public static void main(String[] args)
    
    String name; 
    String address;
    String city; 
    String postal;
    String country;
    
  { 
    c = new Console();
    
    while (true)
    {
      c.println("Please fill in some important information below");
      c.println("Name:");
      name = c.readLine();
      c.println("Address:");
      address = c.readLine();
      c.println("City:");
      city = c.readLine();
      c.println("Postal Code:");
      postal = c.readLine();
      c.println("Country:");
      country = c.readLine();
      printLabels();
    }
  }

      public static void printLabels()
      {
        c.println("Name" + name);
        c.println("Address" + address);
        c.println("City" + city);
        c.println("Postal Code" + postal);
        c.println("Country" + country);
    }
}

  
