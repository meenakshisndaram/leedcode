package isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>m1=new HashMap<>();
        Map<Character,Character>m2=new HashMap<>();
        for (int i =0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);

            if (m1.containsKey(s1) && m1.get(s1)!=t1 || m2.containsKey(t1) && m2.get(t1)!=s1){
                return  false;
            }
            m1.put(s1,t1);
            m2.put(t1,s1);
        }
        return  true;


    }

    public static void main(String...x){
        String s="egg";
        String t ="add";
        Solution solu=new Solution();
       Boolean b= solu.isIsomorphic(s,t);
       System.out.println("The given 2 Strings are isomorphic : " + b);
    }
}