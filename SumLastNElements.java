import java.util.List;

public class SumLastNElements {
		public static void main(String[] args) {
			List<Integer> L1=List.of(5,6,7,8,9,10);
			List<Integer> L2=List.of(8,9,6,3,2,1);
			int n=3;
			int result=sumLastNElements(L2,n);
			System.out.println(getEquation(L2,n)+"="+result);
		}
		private static int sumLastNElements(List<Integer> list,int n) {
			int sums=0;
			int size=list.size();
			if(n>size) {
				System.out.println("Warning : Value of n is greater than the size of the list.");
				n=size;
			}
			for(int i=size-1;i>=size-n;i--) {
				sums+=list.get(i);
			}
			return sums;
			
		}
		private static String getEquation(List<Integer> list,int n) {
			StringBuilder equation=new StringBuilder();
			int size=list.size();
			for(int i=size-n;i<size;i++) {
				equation.append(list.get(i));
				if(i<size-1) {
					equation.append("+");
				}
			}
			return equation.toString();
		}
}
