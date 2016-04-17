import java.util.*;

/**
 * Created by YGZ on 2016/3/2.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs==null || strs.length==0) return null;
        Arrays.sort(strs);
        HashMap<String,List<String>> map = new HashMap<String, List<String>>();
        for (int i=0;i<strs.length;i++){
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String tem = new String(word);
            if(!map.containsKey(tem)){
                List<String> res_list = new ArrayList<String>();
                res_list.add(strs[i]);
                map.put(tem,res_list);
            }else{
                map.get(tem).add(strs[i]);
            }
        }
        Iterator<Map.Entry<String,List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<String>> entry = iterator.next();
            List<String> tem = entry.getValue();
            res.add(tem);
        }
        return res;
    }
    public static void main(String args[]){
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.print(groupAnagrams.groupAnagrams(strings));
    }
}
