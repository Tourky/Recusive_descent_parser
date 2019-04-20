/* Recursive-descent parser
   for the grammar: S->+SS|-SS| a
*/
package recursive_descent_parser;
import java.util.Scanner;
public class Recursive_descent_parser
{
     public final static Scanner input= new Scanner(System.in);
     static char token;
     public static char gettoken()
    {
          return token =nextChar(input);
                  
    }
    public final static char nextChar(Scanner scanner)
    {
        //sets the scanner’s delimiting pattern to the specified pattern.
        scanner.useDelimiter("");
        // for more example see the following 
        //http://www.java2s.com/Code/JavaAPI/java.util/ScanneruseDelimiterStringpattern.htm
        char t=scanner.next().charAt(0);
        scanner.reset();
        return t;
    }
    public static void S()
    {
       switch (token) {
           case 'a':
               gettoken();
               break;
           case '+':
           case '-':
               gettoken();
               S();
               S();
               break;
              default:
                    System.err.println("Syntax error");
                  break;
       }
        
    }
    public static void main(String[] args)
    {
        System.out.println("Parsing the grammar: S->+SS|-SS|a");
       System.out.println("Enter the code according the above grammar");
       while(true)
       {
          System.out.print("code>>");
          System.out.flush();
          //The flush() method forces the data to be written whether or not the buffer is full
          gettoken();
          S();
       }
        
    }
    
}
