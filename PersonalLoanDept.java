import java.util.Arrays;

interface Bank{
	void assignLoan(int[] loan);
	void averageLoan();
	void maxLoan();
	void minLoan();
}
public class PersonalLoanDept implements Bank{
	int[] loanAmount;
	PersonalLoanDept(int client){
		loanAmount=new int[client];
	}
	public void assignLoan(int[] loan) {
		try {
			for(int i=0;i<loanAmount.length;i++) {
				loanAmount[i]=loan[i];
			}
		}catch(Exception e) {
			
		}
		System.out.println("Loans for client processed");
	}
	public void averageLoan() {
		double sum=0;
		for(int i=0;i<loanAmount.length;i++) {
			sum+=loanAmount[i];
		}
		double avg=sum/2;
		System.out.println("Client loan is %2f ",avg);
	}
	public void maxLoan() {
		Arrays.sort(loanAmount);
		System.out.println("Max loan is"+loanAmount[loanAmount.length-1]);
	}
	public void minLoan() {
		Arrays.sort(loanAmount);
		System.out.println("Min loan is"+loanAmount[0]);
}
}
class BusinessLoanDept{
	int[] loanAmount;
	BusinessLoanDept(int client){
		loanAmount=new int[client];
	}
	public void assignLoan(int[] loan) {
		try {
			for(int i=0;i<loanAmount.length;i++) {
				loanAmount[i]=loan[i];
		}
	}catch(Exception e) {
		
	}
	System.out.println("Loans for Business Processed");
	}
	public void averageLoan() {
		double sum=0;
		for(int i=0;i<loanAmount.length;i++) {
			sum+=loanAmount[i];
		}
		double avg=sum/2;
		System.out.println("Client loan is %2f ",avg);
	}
	public void maxLoan() {
		Arrays.sort(loanAmount);
		System.out.println("Max loan is"+loanAmount[loanAmount.length-1]);
	}
	public void minLoan() {
		Arrays.sort(loanAmount);
		System.out.println("Min loan is"+loanAmount[0]);
}
}
//error in line30 and 62....write it as
//double avg = sum / 2;
//System.out.println(String.format("Client loan is %.2f", avg));
