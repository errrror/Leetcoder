/**
 * Created by YGZ on 2016/2/24.
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        for (int i = 0;i<haystack.length()-needle.length()+1;i++){
            int j=0;
            int tem = i;
            while(j<needle.length()&&haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            if (j == needle.length()) {
                return i-j;
            }
            i = tem;

        }
        return -1;
    }
    public static void main(String[] args){
        ImplementstrStr implementstrStr = new ImplementstrStr();
        String hay = "mississippi";
        String needle = "issi";
        int i = implementstrStr.strStr(hay,needle);
        System.out.println(i);
    }
}
