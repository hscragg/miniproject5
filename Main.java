import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     System.out.println("You are entering a car competetition, you must have atleast 4 cars to enter. How many cars do you have?");
    int totalCars = scan.nextInt();
  }
    public static String cars(int num)
    {
    if(num >= 4)
    {
      return ("You can enter the competition!");
    }
    else
    {
      return ("You cannot enter the contest!");

    }
  }
}