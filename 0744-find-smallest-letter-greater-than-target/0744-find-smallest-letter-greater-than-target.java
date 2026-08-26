class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int targ = target;

        for(int i=0;i<letters.length;i++)
        {
            if (targ <letters[i])
            {
                return letters[i];
            }
        }
        return letters[0];
    }
}