package com.fdj.First;

import java.math.BigInteger;
import java.util.*;

/**
 * @Classname niu_work
 * @Description TODO
 * @Date 19-12-27 下午4:31
 * @Created by xns
 */
public class niu_work{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n,m;
        BigInteger a,b;
        Map<BigInteger,BigInteger> map = new HashMap<>();
        List<BigInteger> list = new ArrayList();

        n = in.nextInt();
        m = in.nextInt();
        List<BigInteger> arr = new LinkedList<>();
        for(long i=0;i<n;i++){
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            arr.add(b);
            map.put(b,a);
        }
        for(int i=0;i<m;i++) {
            a = in.nextBigInteger();
            list.add(a);
        }
        Collections.sort(arr);
        for(BigInteger t:list){
            for(int j=arr.size()-1;j>=0;j--){
                if(t.compareTo(map.get(arr.get(j)))>=0){
                    System.out.println(arr.get(j));
                    break;
                }
            }
        }
    }
}
