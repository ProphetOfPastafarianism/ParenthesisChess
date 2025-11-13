public class Parenthesis{
//  Class author:  Magnus Huston
//  Date created:  7/11/2025
//  General description: Given a String s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. 
//An input string is valid if: it has just the characters mentioned above and they are all closed in order
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//below is giberish by me
//SPACE NOT ALLOWED MEMBER
//4 things it cant be for testing
//giberish end
//  Pre-condition: string must contain only "(",")","[","]","{" and "}"
// Dont use other words or numbers 
//  Post-condition: this will tell you if your string is valid or not
public static boolean isValid(String test){
  //this tests if it has all the brackets required and then if any of them are in the wrong spot and that it doesnt end funky
      
  //loop 
  for (int i =0;test.length()>=i;i++)
      if (test.substring(i,i+1).equals("("))
      if (test.indexOf("[")+1!=test.indexOf(")")&&test.indexOf("[")+1!=test.indexOf("}"))
      if (test.indexOf("{")+1!=test.indexOf(")")&&test.indexOf("{")+1!=test.indexOf("]"))
      if (test.endsWith("{")==false&&test.endsWith("(")==false&&test.endsWith("[")==false)
            return true;
      //remove
      
      //}
      return false;
             

}

public static void main(String[] args) {
isValid("{([])}");
}




}