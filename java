import java.util.*;
import java.util.Scanner;
public class Main {
	static public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String v1=sc.next();
		String v2=sc.next();
		String[] v1arr=v1.split("\\.");
		String[] v2arr=v2.split("\\.");
		int max=(v1arr.length>v2arr.length?v1arr.length:v2arr.length);
		for(int i=0;i<max;i++) {
			int n1=(v1arr.length<=i)?0:Integer.parseInt(v1arr[i]);
			int n2=(v2arr.length<=i)?0:Integer.parseInt(v2arr[i]);
			if(n1>n2) {
			    System.out.println("doungrade");
			    return;
			}else if(n1<n2){
				System.out.println("updated");
			    return;
			}
		}
		System.out.println("same");
		
        
	}
}

//1.01.34    ->  ["1","01","34"]
//1.01.0
//
//2   3   4   5   6   7
//
//2   3   5   8  13   21


