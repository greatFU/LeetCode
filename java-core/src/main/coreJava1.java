package main;
import java.util.HashSet;
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
}
