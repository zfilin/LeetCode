package ua.com.unicatstudio.leetcode;

public class P0028_ImplementStrStr {
    // https://leetcode.com/problems/implement-strstr/
    // https://www.linkedin.com/posts/alexander-lapshyn_leetcode-activity-6914664147985010688-gaU8

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int step = 1;
        if (needleChar.length > 2)
            while(step < needleChar.length-1 && needleChar[0] != needleChar[step]) step++;
        int ph = 0;
        while (ph <= haystackChar.length - needleChar.length) {
            int pn = 0;
            while (pn < needleChar.length && haystackChar[ph+pn] == needleChar[pn]) pn++;
            if (pn == needleChar.length) return ph;
            if (pn == 0) pn = 1;
            ph += Math.min(step, pn);
        }
        return -1;
    }
}
