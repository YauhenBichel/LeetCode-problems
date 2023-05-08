package com.bichel.top_interview_questions;

import java.util.Stack;

/*
You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.

A string is called balanced if and only if:

It is the empty string, or
It can be written as AB, where both A and B are balanced strings, or
It can be written as [C], where C is a balanced string.
You may swap the brackets at any two indices any number of times.

Return the minimum number of swaps to make s balanced.
 */

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[')
                stack.push(ch);
            else {
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        int unb = stack.size() / 2; // # of open or close bracket
        return (unb + 1) / 2;
    }
}
