package com.figure;

import java.util.Scanner;

/**
 * @Classname three_two
 * @Description 很巧的一个方法，但是过不了变编译，待解决。
 * @Date 19-12-14 下午9:20
 * @Created by xns
 */
public class three_two {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] flags = new boolean[length];
        for(int i=0;i<length;i++){
            if(flags[numbers[i]]){
                duplication[0] = numbers[i];
                return true;
            }
            flags[numbers[i]] = true;
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
