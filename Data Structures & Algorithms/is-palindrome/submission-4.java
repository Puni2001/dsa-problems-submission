class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }

        }

        String str = cleaned.toString();
        String rev = cleaned.reverse().toString();


        return str.equals(rev);

    }
}
