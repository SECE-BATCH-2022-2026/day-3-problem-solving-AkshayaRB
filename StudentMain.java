import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Student> ss = new HashSet<Student>();
        int n=Integer.parseInt(br.readLine());
        int rollNo;
        String name;
        Student s;
        for(int i=0; i<n; i++){
            rollNo = Integer.parseInt(br.readLine());
            name = br.readLine();
            s = new Student(rollNo, name);
            ss.add(s);
        }
        for(Student s1 : ss){
            System.out.println(s1);
        }
    }
}