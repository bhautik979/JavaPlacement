import java.util.*;
class Infixtopostfix{
    public static int Prec(char c){
        if(c=='+' || c=='-'){return 1;}
        if(c=='/' || c=='*'){return 2;}
        if(c=='^'){return 3;}
            return -1;
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        
       char c;
       String result=new String("");
        
       Stack<Character> s=new Stack<>();
       for(int i=0;i<exp.length();i++){   //o(n)
           
           c=exp.charAt(i);
           
           if(Character.isLetterOrDigit(c))
           {
               result+=c;
           }
           else if(c=='('){
               s.push(c);
           }
           else if(c==')'){
               
               while(!s.empty() && s.peek()!='('){
                   result+=s.peek();
                   s.pop();
               }
               s.pop();
           }
           
           else{
               
               while(!s.empty()  && Prec(c)<=Prec(s.peek())){       //a*b+c ma +(1) aave to *(2) ne result ma add kari de
                   result+=s.peek();
                   s.pop();
               }
               s.push(c);
           }
            
           
        }
        
        while(!s.empty()) {
            result += s.peek();
            s.pop();}
            
        return result;
    }

    public static void main(String[] args) {
        String str="a*(b+c)/d";
        System.out.println(infixToPostfix(str) );
    }
}