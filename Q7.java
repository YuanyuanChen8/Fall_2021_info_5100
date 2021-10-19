package com.company;

public class Q7 {

    public String addStrings(String Num1, String Num2) {
        char[] num1 = Num1.toCharArray();
        char[] num2 = Num2.toCharArray();
        int n = num1.length;
        int m = num2.length;
        int i = n-1, j = m - 1, key = 0;
        StringBuilder str = new StringBuilder();
        while(i>=0||j>=0){
            int x=i>=0?num1[i--]-'0':0;
            int y=j>=0?num2[j--]-'0':0;
            int sum=key+x+y;
            str.insert(0,sum%10);
            key=sum/10;
        }
        if(key==1){
            str.insert(0,1);
        }
        return str.toString();
    }
}
//415