import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner mystr = new Scanner(System.in);
    
    System.out.println("Enter a word:");
    String txt = mystr.nextLine();
  System.out.println(txt.length());
    //Your code will return the length of the entered String
    mystr.close();
  }
}
