package main;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class coreJava1 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> array= new HashSet<>();
        for(int num : nums){
            if(array.contains(num)){
                return true;
            }
            array.add(num);
        } 
        return false;
    }

    public static boolean isAnagram(String s, String t){
        Map<Character,Integer> first = new HashMap<>();
        Map<Character,Integer> second = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(first.containsKey(s.charAt(i))){
                first.put(s.charAt(i),first.get(s.charAt(i))+1);
            }else{
                first.put(s.charAt(i),1);
            }
        }
        for(int i=0; i<t.length(); i++){
            if(second.containsKey(t.charAt(i))){
                second.put(t.charAt(i),second.get(t.charAt(i))+1);
            }else{
                second.put(t.charAt(i),1);
            }
        }
        return first.equals(second);
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }else{
                count.put(s.charAt(i),1);
            }
            }
        for(int i=0; i<s.length(); i++){
            if (count.getOrDefault(s.charAt(i), 0) == 1)
            return i;
        }
        return -1;
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidat = count;
        for(int num : nums){
            if(count == 0){
                candidat = num;
            }   
            if(num != candidat){
                count--;
            }else{
                count++;
            }
            
        }
        return candidat;
    }
}
