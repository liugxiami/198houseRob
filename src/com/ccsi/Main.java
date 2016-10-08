package com.ccsi;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] houses={10,3,2,4,5,1};
        System.out.println(rob(houses));
    }
    //1.
    public static int rob(int[] nums){
        int[] cache=new int[nums.length+1];
        return rb(nums,0,cache);
    }
    public static int rb(int[] nums,int index,int[] cache){
        if(index>=nums.length)return 0;
        cache[index+1]=rb(nums,index+1,cache);
        cache[index]=nums[index]+rb(nums,index+2,cache);
        return Math.max(cache[index],cache[index+1]);
    }
    //2.
    public static int rob1(int[] nums){
        return rb1(nums,0);
    }
    public static int rb1(int[] nums,int index){
        if(index>=nums.length)return 0;
        int plan1=nums[index]+rb1(nums,index+2);
        int plan2=rb1(nums,index+1);
        return Math.max(plan1,plan2);
    }
}
