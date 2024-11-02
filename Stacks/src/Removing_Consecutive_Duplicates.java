import java.util.Stack;

public class Removing_Consecutive_Duplicates {
    public static String removeConsecutiveDuplicates(String str)
    {
        if(str.equals("") || str.length()==1) {
            return str;
        }

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<str.length();i++)
        {
            if(stack.isEmpty()) {
                stack.push(str.charAt(i));
            }

            else if(str.charAt(i)==stack.peek()) {
                stack.pop();
                stack.push(str.charAt(i));
            }

            else{
                stack.push(str.charAt(i));
            }
        }


        char[] arr = new char[stack.size()];
        int k=stack.size()-1;

        while(!stack.isEmpty())
        {
            arr[k] = stack.pop();
            k--;
        }


        String res = new String(arr);

        return res;
    }

    public static void main(String[] args) {

        String str = "aaaaaabaabccccccc";

        String result = removeConsecutiveDuplicates(str);

        System.out.println(result);

    }
}
