package tryWithResource;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SingleAndMultipleResource {
	public static void main(String[] args) {
		//SAmple 1 no catch , resources are mentioned in () next to try. resources are automatically closed
		try(Scanner sc= new Scanner(System.in)){
			int a = sc.nextInt();
			System.out.println(a);
		}
		
		
		//Sample2 with catch
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			System.out.println(a);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Sample 3 with multiple resources. separate each resource by ;
	
		try (Scanner scanner = new Scanner(new File("testRead.txt"));
			    PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			    while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			    }
			}
	}
}
