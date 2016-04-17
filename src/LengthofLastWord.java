/**
 * Created by YGZ on 2016/3/10.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        if (chars.length<1) return 0;
        if (chars.length==1&&chars[0]!=' ') return 1;
        if (chars.length==1&&chars[0]==' ') return 0;
        int res = 0;
        for (int i=chars.length-1;i>=0;i--){
            if (chars[i]!=' '){
                res++;
            }
            if (res==0&&chars[i]==' ') continue;
            if (chars[i]==' ') return res;
        }
        return res;
    }
    public static void main(String args[]){
        String s = "a ";
        LengthofLastWord lengthofLastWord = new LengthofLastWord();
        System.out.println(lengthofLastWord.lengthOfLastWord(s));
    }
}
