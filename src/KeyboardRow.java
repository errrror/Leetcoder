import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by YGZ on 2017/3/8.
 * My email : gzyang1125@foxmail.com
 */
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        char[][] arr = new char[26][2];
        for (int i=0;i<26;i++){
            arr[i][0] =(char)(97+i);
        }
        for (int i=0;i<26;i++){
            if (arr[i][0]=='q'||arr[i][0]=='w'||arr[i][0]=='e'||arr[i][0]=='r'||arr[i][0]=='t'||arr[i][0]=='y'||arr[i][0]=='u'||arr[i][0]=='i'||arr[i][0]=='o'||arr[i][0]=='p'){
                arr[i][1] = 'a';
            }else if (arr[i][0]=='a'||arr[i][0]=='s'||arr[i][0]=='d'||arr[i][0]=='f'||arr[i][0]=='g'||arr[i][0]=='h'||arr[i][0]=='j'||arr[i][0]=='k'||arr[i][0]=='l'){
                arr[i][1] = 'b';
            }else {
                arr[i][1] = 'c';
            }
        }
        for (int i=0;i<words.length;i++){
            String ss = words[i];
            boolean flag = true;
            String s = ss.toLowerCase();
            char first = s.charAt(0);
            char tem = arr[first-97][1];
            for (int j=1;j<s.length();j++){
                if (arr[s.charAt(j)-97][1]!=tem){
                    flag = false;
                    break;
                }
            }
            if (flag){
                list.add(ss);
            }
        }
        return list.toArray(new String[list.size()]);
        /*String[] res = new String[list.size()];
        for (int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;*/
    }

    public static void main(String[] args) {
        String[] start = {"adsdf","sfd"};
        String[] end = KeyboardRow.findWords(start);
        for (int i=0;i<end.length;i++){
            System.out.println(end[i]);
        }
    }
}
