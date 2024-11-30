
public class DataAnalytics {
	protected int a;
	protected int b;
	public DataAnalytics(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int formula() {
		return a+b;
	}
	public int formula(Integer d) {
		return (a+b)-d;
	}
	public int formula(String d) {
		int value=Integer.parseInt(d);
		return (a+b)-value;
	}
	
}
class DataAnalyticsOverride1 extends DataAnalytics{
	public DataAnalyticsOverride1(int a, int b) {
		super(a,b);
	}
	@Override
	public int formula(Integer d) {
		return super.formula(d);
	}
}
class DataAnalyticsOverride2 extends DataAnalytics{
	public DataAnalyticsOverride2(int a, int b) {
		super(a,b);
	}
	@Override
	public int formula(String d) {
		return super.formula(d);
	}
}
//public class Solution