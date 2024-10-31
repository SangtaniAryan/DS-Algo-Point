import java.util.*;

public class Bracket {
    public static void main(String[] args)
    {    
         Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.print("Enter the expression :"); //User interaction lines
        String S=sc.next(); //Alphabetic Characters to Process and Store in a variable
        Stack<Character> brace=new Stack<Character>();
        for(int i=0;i<S.length();i++) //defined variable I as integer data type 
        {
            if(S.charAt(i)=='{' || S.charAt(i)=='[' || S.charAt(i)=='(')
            { 
                brace.add(S.charAt(i));

            } //if condition is used with multiple AND function to retrieve proper results
            if(brace.isEmpty())
            {
               flag=1;
           
                break;
            } //This is another exit part for code if code doesn't work or isempty then this code is apply
            if(S.charAt(i)=='}' )
            {
                if(brace.peek()=='{')
                {
                    brace.pop();
                } //if bracket is open from one side and also from other this if condition is apply
                else
                {
                   flag=1;
               
                    break;
                } // or else unbalance result is generate
            }
            if(S.charAt(i)==']' )
            {
                if(brace.peek()=='[')
                {
                    brace.pop();
                }
                else
                {
                   flag=1;
                
                    break;
                }
            }
            if(S.charAt(i)==')' )
            {
                if(brace.peek()=='(')
                {
                    brace.pop();
                }
                else
                {
                    flag=1;
           
                    break;
                }
            }
            
            
            
        }
          if(!brace.isEmpty())
          {
              flag=1;
          }
          if(flag==1)
          {
              System.out.println("Not Balanced");
          }
          else
          {
              System.out.println("Balanced");
          }

    }
    
}
/*
I/O 
Input
Enter the Expression :

Output
If the expression is Balanced =>"Balanced";
If not  =>"Not Balanced"

Example 1:Expression is :{{{[([][])]}}}
          Output:"Balanced" 
          
Example 2:Expression is ({}{[]{}
          Output:"Not Balanced"          


Time Complexity:O(n) n=length of String
Space Complexity:O(1)
*/