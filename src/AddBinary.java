/**
 * Created by YGZ on 2016/3/17.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        String res = "";
        if (a.length()==0) return b;
        if (b.length()==0) return a;
        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();
        int len = Math.max(a.length(),b.length())+1;
        int lena = a.length();
        int lenb = b.length();
        int lenres = Math.max(lena,lenb)+1;
        char[] reschar = new char[lenres];
        int c = 0;
        while(lena-1>=0&&lenb-1>=0){
            int A = achar[lena-1] - 48;
            int B = bchar[lenb-1] - 48;
            if (A+B+c>=2){
                reschar[lenres-1] = (char)((A+B+c)%2+48);
                c = (A+B+c)/2;
            }else{
                reschar[lenres-1] = (char)((A+B+c)%2+48);
                c=0;
            }
            lena--;
            lenb--;
            lenres--;
        }
        if (lena==0&&lenb==0){
            reschar[lenres---1] = (char)(c+48);
            if (reschar[lenres]=='0'){lenres++;}
            for (int i=lenres;i<len;i++){
                res += reschar[i];
            }
        }else if (lena==0&&lenb!=0){
            while(lenb-1>=0){
                int B = bchar[lenb---1] - 48;
                if (B+c>=2){
                    reschar[lenres---1] = (char)((B+c)%2+48);
                    c = (B+c)/2;
                }else{
                    reschar[lenres---1] = (char)((B+c)%2+48);
                    c=0;
                }
            }
            if (c==1) {reschar[lenres---1] = (char)(1+48);}
            if (reschar[lenres]=='0'){lenres++;}
            for (int i=lenres;i<len;i++){
                res += reschar[i];
            }
        }else if (lenb==0&&lena!=0){
            while(lena-1>=0){
                int A = achar[lena---1] - 48;
                if (A+c>=2){
                    reschar[lenres---1] = (char)((A+c)%2+48);
                    c = (A+c)/2;
                }else{
                    reschar[lenres---1] = (char)((A+c)%2+48);
                    c=0;
                }
            }
            if (c==1) {reschar[lenres---1] = (char)(1+48);}
            if (reschar[lenres]=='0'){lenres++;}
            for (int i=lenres;i<len;i++){
                res += reschar[i];
            }
        }
        return res;
    }
    public static void main(String args[]){
        String a = "111";
        String b = "11";
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary(a,b));
    }
}
