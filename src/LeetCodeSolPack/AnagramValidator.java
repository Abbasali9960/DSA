package LeetCodeSolPack;

import java.util.HashMap;

public class AnagramValidator {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray())
        {
            if(map.containsKey(c))
            {
                int curr = map.get(c);
                if(curr==1)
                {
                    map.remove(c);
                }
                else
                {
                    map.put(c,curr-1);
                }
            }
        }


        return map.isEmpty();
    }

    public static void main(String[] args) {
      String s = "listen";
      String t = "silent";
      AnagramValidator check = new AnagramValidator();
      if(check.isAnagram(s,t))
      {
          System.out.println("Anagram");
      }
      else {System.out.println("Not Anagram");}

    }
}
