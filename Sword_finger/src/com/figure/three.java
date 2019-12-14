package com.figure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname three
 * @Description time o(n)  space:o(1) ,改变了原来输入数组
 * @Date 19-12-14 下午9:01
 * @Created by xns
 */
public class three {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if(length == 0 || numbers == null){
            return false;
        }
        for (int i = 0; i <length; i++) {
            if(numbers[i]<0||numbers[i]>length-1){
                return false;
            }
        }
        for(int i=0;i<length;i++){
            if(numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                else{
                    int temp = numbers[i];
                    numbers[i] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] duplication = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if(new three().duplicate(arr,n,duplication)){
            System.out.println("重复数字:"+duplication[0]);
        }
    }
}
