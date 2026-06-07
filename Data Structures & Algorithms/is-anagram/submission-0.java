class Solution {
    public boolean isAnagram(String s, String t) {

        if(t.length()!=s.length())return false;

        char[] sR = s.toCharArray();
        char[] tR = t.toCharArray();

        Arrays.sort(sR);
        Arrays.sort(tR);

        return Arrays.equals(sR,tR);
    }
}
