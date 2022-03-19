package ua.com.unicatstudio.leetcode;

public class P0014_LongestCommonPrefix {
    // https://leetcode.com/problems/longest-common-prefix/

    public String longestCommonPrefix(String[] strs) {
        switch ( strs.length ) {
            case (0): return "";
            case (1): return strs[0];
        }

        String result = strs[0];
        for(int i = 1; i < strs.length; i++) {
            int prefixLength = Math.min(result.length(), strs[i].length());
            while ( !strs[i].startsWith(result) ) result = result.substring(0,prefixLength--);
            if( result.isEmpty() ) break;
        }
        return result;
    }
}
