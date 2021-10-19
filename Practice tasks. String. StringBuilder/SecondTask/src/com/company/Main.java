package com.company;

import java.util.Deque;
import java.util.Map;
import java.util.ArrayDeque;


class MyUtils
{
    private static final Map<Character, Character> OPENING = Map.of(
            ']', '[',
            ')', '(',
            '}', '{'
    );

    public boolean verifyBrackets(String text)
    {
        text = text.replaceAll("\\\\[\\Q(){}[]\\E]", "");
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : text.toCharArray()) {
            switch (ch)
            {
                case '[':
                case '(':
                case '{':
                    stack.push(ch);
                    break;
                case ']':
                case ')':
                case '}':
                    if (stack.isEmpty() || stack.pop() != OPENING.get(ch)) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}


public class Main {

    public static void main(String[] args)
    {
        MyUtils obj = new MyUtils();
        String[] trueTestCases = { "()", "()[]{}", "{(())}", "(\\()"};
        String[] falseTestCases = {"(]", ")(","([)]"};
        for (String s : trueTestCases) {
            if (!obj.verifyBrackets(s)) {
                System.out.println("Expected true, but get false for: " + s);
            }
        }
        for (String s : falseTestCases) {
            if (obj.verifyBrackets(s)) {
                System.out.println("Expected false, but get true for: " + s);
            }
        }
    }
}
