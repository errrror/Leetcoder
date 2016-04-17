import java.util.HashMap;
import java.util.Map;

/**
 * Created by YGZ on 2016/2/25.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        if (board.length == 0) return false;
        int length = board[0].length;
        for (int i = 0;i<length;i++){
            hashMap = initmap(hashMap);
            for (int j = 0;j<length;j++){
                if (board[i][j]>='1'&&board[i][j]<='9'){
                    if (hashMap.get(board[i][j])>0){
                        return false;
                    }else{
                        hashMap.put(board[i][j],1);
                    }
                }else if (board[i][j]!='.'){
                    return false;
                }
            }
        }
        for (int i=0;i<length;i++){
            hashMap = initmap(hashMap);
            for (int j=0;j<length;j++){
                if (board[j][i]>='1'&&board[j][i]<='9'){
                    if (hashMap.get(board[j][i])>0){
                        return false;
                    }else{
                        hashMap.put(board[j][i],1);
                    }
                }else if (board[j][i]!='.'){
                    return false;
                }
            }
        }
        for (int i=0;i<length;i=i+3){
            for (int j=0;j<length;j=j+2){
                hashMap = initmap(hashMap);
                for (int m=i;m<i+3;m++){
                    for (int n=j;n<j+3;n++){
                        if (board[m][n]>='0'&&board[m][n]<='9'){
                            if (hashMap.get(board[m][n])>0){
                                return false;
                            }else {
                                hashMap.put(board[m][n],1);
                            }
                        }else if (board[m][n] != '.'){
                            return false;
                        }
                    }
                }

            }
        }
        return true;
    }
    public HashMap<Character,Integer> initmap(HashMap<Character,Integer> map){
        for (char i='1';i<='9';i++){
            map.put(i,0);
        }
        return map;
    }
    public static void main(String[] args){
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] chars = {{'.','2','1'},{'2','.','.'},{'3','.','.'}};
        System.out.print(validSudoku.isValidSudoku(chars));
    }
}
