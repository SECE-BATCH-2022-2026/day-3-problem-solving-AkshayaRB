import java.io.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputstreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		String [] inp = new Sting[n];
		for(i=0;i<n;i++){
			inp[i] .br.readLine();
		}
		String [] op= UserMainCode.removeDuplicate(inp);
		for(String s:op){
			System.out.println(s);
		}
		System.out.println("Using lambda");
		// Stream<String> st= Arrays.stream(op)
		// st.forEach(System.out::println);
		//Arrays.Stream(op).forEach(x->System.out.println(x));
		
		br.close();
		
		
	}
}
class UserMainCode {
    public static String [] removeDuplicate (String [] inp){
    	set.<String> ts = new TreeSet<String>();
    	for(String s:inp){
    		ts.add(s);
    	}
    	String[] res = new String[ts.size()];
    	int i=0;
    	for(STring s:ts){
    		res[i++]=s;
    	}
        return res;
    }
}