package LeetCodeSolPack;

import java.util.HashMap;

public class romanToInteger {
    public int romanToInt(String s) {
        int out = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5 );
        mp.put('X', 10 );
        mp.put('L', 50 );
        mp.put('C', 100 );
        mp.put('D', 500 );
        mp.put('M', 1000 );
        
       int n = s.length();
        
            for(int i=0;i<n;i++)
            {
                if(i<n-1 && mp.get(s.charAt(i))< mp.get(s.charAt(i+1)))
                {
                    out =out+ mp.get(s.charAt(i+1))-mp.get(s.charAt(i));
                    i++;
                }
                else
                {
                    out=out+mp.get(s.charAt(i));
                }
               
            }
            return out;
        }
    public static void main(String[] args) {
    	romanToInteger rti = new romanToInteger();
    	int val =rti.romanToInt("XV");
    	System.out.println(val);
    	}
    }
