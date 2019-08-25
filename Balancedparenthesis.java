package com.upgrad.practise;

import java.util.Stack;

public class Balancedparenthesis {


    public static void main(String args[]){

        checkBalanced(new String[]{"{{()}}","((})","()"});
    }

    public static String[] checkBalanced(String[] strings){

        String [] x= new String[strings.length];
        int xCount=0;
        for(String str:strings) {
            int len = str.length();
            boolean balanced = true;
            Stack<Character> stk = new Stack<Character>();

            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == '{') {
                    stk.push(ch);
                } else {
                    if (ch == ')')
                        ch = '(';
                    if (ch == '}')
                        ch = '{';

                    if (stk.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    if (ch == stk.peek())
                        stk.pop();
                    else {
                        balanced = false;
                        break;
                    }
                }
            }
            if(balanced){
                x[xCount]="YES";
                System.out.println("YES");
            }
            else{
                x[xCount]="NO";
                System.out.println("NO");
            }

            xCount++;
        }

        return x;
    }
}

