package LeetCodeSolPack;

import java.util.HashMap;

public class countOfCharacterInString {
    public static void main(String[] args)
    {
        String s = "Abbas";
        HashMap<Character,Integer> checkCount = new HashMap<>();
        char[]str = s.toLowerCase().toCharArray();
        for(int i = 0 ; i<s.length();i++)
        {
            if(checkCount.containsKey(str[i]))
            {
                checkCount.put(str[i],checkCount.get(str[i]) + 1);
            }
            else
            {
                checkCount.put(str[i],1);
            }
        }
        System.out.println(checkCount);
    }
}
