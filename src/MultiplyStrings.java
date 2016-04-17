import java.math.BigInteger;

/**
 * Created by YGZ on 2016/2/29.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        char[] num1char = num1.toCharArray();
        char[] num2char = num2.toCharArray();
        int[] num1arr = new int[length1];
        int[] num2arr = new int[length2];
        for (int i=length1-1;i>=0;i--){
            num1arr[length1-1-i] = num1char[i]-48;
        }
        for (int i=length2-1;i>=0;i--){
            num2arr[length2-1-i] = num2char[i]-48;
        }
        String reeult = multi(num1arr,num2arr);
        return reeult;
    }
    public String multi(int[] num1,int[] num2){
        int sum = num1.length+num2.length+3;
        int[] res = new int[sum];
        for (int i=0;i<num1.length;i++){
            for (int j=0;j<num2.length;j++){
                res[i+j] += num1[i]*num2[j];
            }
        }
        for (int i=0;i<sum;i++){
            int up = res[i]/10;
            res[i] = res[i]%10;
            if (i<sum-1){
                res[i+1] += up;
            }
        }
        int max = 0;
        for (int i=sum-1;i>0;){
            if (res[i]>0) {
                max = i;
                break;
            }
            i--;
        }
        String result = "";
        for (int i=max;i>=0;i--){
            result += String.valueOf(res[i]);
        }
        return result;
    }
    public static void main(String args[]){
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        String num1 = "12312312313213";
        String num2 = "2143124124141414";
        String res = multiplyStrings.multiply(num1,num2);
        System.out.println(res);
    }
}
