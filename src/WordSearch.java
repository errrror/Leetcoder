import java.util.HashMap;

/**
 * Created by YGZ on 2016/3/29.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (board[i][j]!=word.charAt(0)){
                    continue;
                }else{
                    board[i][j] = 1;
                    if (helper(board,i,j,word,0)){
                        return true;
                    }else {
                        board[i][j] = word.charAt(0);
                        continue;
                    }
                }
            }
        }
        return false;
    }
    private static boolean helper(char[][] board,int r,int c,String word,int step){
        if (step==word.length()) return true;
        if (r-1>=0&&board[r-1][c]==word.charAt(step+1)){
            board[r-1][c] = 1;
            if (helper(board,r-1,c,word,step+1)) return true;
            board[r-1][c] = word.charAt(step+1);
        }
        if (c+1<board[0].length&&board[r][c+1]==word.charAt(step+1)){
            board[r][c+1] = 1;
            if (helper(board,r,c+1,word,step+1)) return true;
            board[r][c+1] = word.charAt(step+1);
        }
        if (r+1<board.length&&board[r+1][c]==word.charAt(step+1)){
            board[r+1][c] = 1;
            if (helper(board,r+1,c,word,step+1)) return true;
            board[r+1][c] = word.charAt(step+1);
        }
        if (c-1>=0&&board[r][c-1]==word.charAt(step+1)){
            board[r][c-1] = 1;
            if (helper(board,r,c-1,word,step+1)) return true;
            board[r][c-1] = word.charAt(step+1);
        }
        return false;
    }
    public static void main(String[] args){
        //String word = "ABCCED";
        //char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        //char[][] board = {{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'}};
        //String word = "aaaaaaaaaaaaa";
        char[][] board = {{'b','a','a','b','a','b'},{'a','b','a','a','a','a'},{'a','b','a','a','a','b'},{'a','b','a','b','b','a'},{'a','a','b','b','a','b'},{'a','a','b','b','b','a'},{'a','a','b','a','a','b'}};
        String word = "aabbbbabbaababaaaabababbaaba";
        System.out.println(new WordSearch().exist(board,word));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int start = m - 1;
        int i=m-1,j=n-1;
        if(m==0){
            for (int k = 0;k<n;k++){
                nums1[k] = nums2[k];
            }
            return;
        }else if (n==0){
            return;
        }
        while (i>=0 && j>=0) {
            if (nums1[i] >= nums2[j]) {
                nums1[end--] = nums1[i--];
            } else {
                nums1[end--] = nums2[j--];
            }
        }
        while (i>=0){
            nums1[end--] = nums1[i--];
        }
        while(j>=0){
            nums1[end--] = nums2[j--];
        }
    }
}
