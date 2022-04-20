package lesson4;

import java.util.*;
import java.lang.*;

public class ArrayDecoding {

    public static int[] decompressingList(int[] nums) {
        int size = 0, k = 0;
        for(int i=0;i<nums.length;i+=2)
            size += nums[i];
        int[] arrayTemp = new int[size];
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++)
                arrayTemp[k++] = nums[i+1];
        }
        return arrayTemp;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int [] output;
        output = decompressingList(input);
        System.out.println(Arrays.toString(output));
    }



}
