//repeat front
import java.io.*;
class Main{
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputstreamReader(System.in));
		String inp = br.readLine();
		Integer n =Integer.parseInt(br.readLine());
		System.out.println(UserMainCode.repeatFront(inp,n));
	}
}
class UserMainCode {
    public static String repeatFront(String inp, Integer n){
        int l = inp.length();
        if (n > l) {
            return inp;
        }
        else {
            String res = "";
            for (int i = n; i >= 1; i--) {
                res += inp.substring(0, i);
            }

            return res;
        }
    }
}


