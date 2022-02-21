public class Lexer {
    
    public static boolean checkParentesis (String str)
     Char izquierdo = "(";
     Char derecho = ")";

     Stack<Character> stack = new Stack<>();

     for (int i = 0; i < str.length(); i++)
     {
         if (str.charAt(i) == izquierdo)
         {
             stack.push(izquierdo);
         }
         else if (str.charAt(i) == derecho)
         {
             if (stack.isEmpty())
             {
                 return False;
             }
             if (stack.pop() != izquierdo)
             {
                 return False;
             }

     }

     public static ArrayList<String> getInstrutions (String str)
     {
        str = str.trin().replaceAll(" ", " ");

        Char izquierdo = "(";
        Char derecho = ")"; 

        int comenzarBloquesIndex = 0;
        int finalBloquesIndex = str.length() -1;

        ArrayList<String> bloques = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            String charActual = str.charAt(i) + "";
            if (str.charAt(i) == izquierdo)
            {
                stack.push(izquierdo)
            }

        }

        




     }














}
