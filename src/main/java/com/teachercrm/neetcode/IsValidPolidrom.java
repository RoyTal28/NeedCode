package com.teachercrm.neetcode;

public class IsValidPolidrom {

    public static boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i=0;
        int j=cleanString.length()-1;
        char[] charArray = cleanString.toCharArray();
        while (i<=j)
        {
            if(charArray[i] != charArray[j])
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args)
    {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
