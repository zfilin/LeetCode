package ua.com.unicatstudio.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P0020_ValidParentheses {
    // https://leetcode.com/problems/valid-parentheses/

    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>() {{
            put('(',')');
            put('[',']');
            put('{','}');
        }};

        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( brackets.containsKey(c) )
                stk.push(brackets.get(c));
            else if ( stk.isEmpty() )
                return false;
            else if ( c != stk.pop() )
                return false;
        }

        return stk.isEmpty();
    }
}
