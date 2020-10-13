import java.util.Scanner;

public class QuestionsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scnr = new Scanner(System.in);
      System.out.println("Ready for the guess game!");
      System.out.println("Appetizer Non Vegetarian : Chicken Wings and Lamb Roast");
      System.out.println("Appetizer Vegan:Tofu");
      System.out.println("Appetizer Vegetarian:Cheese Curds");
      System.out.println("Dessert Vegan:Lemon Pie");
      System.out.println("Dessert : Strawberry Ice Cream and Starwberry Short Cake");
      System.out.println("Please choose a item from the above list");
      System.out.println("Is it a Dessert (y/n) :");
      String yourChoice = scnr.next();
      if(yourChoice.equalsIgnoreCase("y"))
      {
    	  System.out.println("Is it vegan (y/n) :");
          yourChoice = scnr.next(); 
          if(yourChoice.equalsIgnoreCase("y"))
          {
        	  System.out.println("Does it contain Nuts (y/n) :");
              yourChoice = scnr.next();
              if(yourChoice.equalsIgnoreCase("y"))
              {
            	  System.out.println("Your choice is Peanut Butter Cookies");
              }
              else
              {
            	  System.out.println("Your choice is Lemon Pie");
              }
          }
          else
          {
        	  System.out.println("Is it refrigerated (y/n) :");
              yourChoice = scnr.next();
              if(yourChoice.equalsIgnoreCase("y"))
              {
            	  System.out.println("Your choice is Strawberry Ice Cream");
              }
              else
              {
            	  System.out.println("Your choice is Strawberry Short Cake");
              }  
          }
          
      }
          else
          {
        	  System.out.println("Is it vegetarian (y/n) :");
              yourChoice = scnr.next(); 
          
        	  if(yourChoice.equalsIgnoreCase("y"))
              {
            	  System.out.println("is it Vegan (y/n) :");
                  yourChoice = scnr.next();
                  if(yourChoice.equalsIgnoreCase("y"))
                  {
                	  System.out.println("Your choice is Tofu");
                  }
                  else
                  {
                	  System.out.println("Your choice is Cheese Curds");
                  }
              }
        	  else
        	  {
        	  	  System.out.println("Is it white meat (y/n) :");
        	      yourChoice = scnr.next();
        	      if(yourChoice.equalsIgnoreCase("y"))
        	      {
        	    	  System.out.println("Your choice is Chicken Wings");
        	      }
        	      else
        	      {
        	    	  System.out.println("Your choice is Lamb Roast");
        	      }  
        	  }
        	 
          }
        scnr.close();	  
      }
	}


