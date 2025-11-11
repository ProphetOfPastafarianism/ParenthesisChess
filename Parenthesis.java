public class Parenthesis{
//  Class author:  Magnus Huston
//  Date created:  7/11/2025
//  General description: Given a String s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. 
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//SPACE NOT ALLOWED MEMBER
//4 things it cant be for testing
public static void isValid(String test){
    //ts will work/probably
    if (test.contains("()")||test.contains("[]")||test.contains("{}")){
      if (test.indexOf("("+1)!=test.indexOf("}")&&test.indexOf("("+1)!=test.indexOf("]"))
        if (test.indexOf("["+1)!=test.indexOf(")")&&test.indexOf("["+1)!=test.indexOf("}"))
          if (test.indexOf("{"+1)!=test.indexOf(")")&&test.indexOf("{"+1)!=test.indexOf("]"))
            System.out.println("i did it!");
    else
          System.out.println("fart");
    }
    
}

public static void main(String[] args) {
isValid("({)[]");
}




}