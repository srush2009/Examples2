import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CeilFunction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		List<Integer> l1=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			l1.add(sc.nextInt());
		}
		function.findTotalCost(l1);
	}
}
class function{
	public static void findTotalCost(List<Integer> arr) {
		double totalCost=0;
		Collections.sort(arr,new Comparator<>() {

			@Override
			public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		});
		while(arr.size()!=1) {
			System.out.println(arr);
			float minimum=arr.get(0);
			float maximum=arr.get(arr.size()-1);
			double cost=Math.ceil((minimum+maximum)/(maximum-minimum+1));
			System.out.println(cost);
			totalCost+=cost;
			arr.remove(0);
			arr.remove(arr.size()-1);
			arr.add((int)(maximum+minimum));
			Collections.sort(arr,new Comparator<>(){

				@Override
				public int compare(Integer a, Integer b) {
					
					return a-b;
				}
				
			});
		}
		System.out.println("TotalCost:"+totalCost);
	}
}
