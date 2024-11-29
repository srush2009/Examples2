import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mobile {
	Map<String,List<String>> mobiles=new HashMap<>();
	public String  addMobile(String company, String model) {
		if(mobiles.containsKey(company)) {
			mobiles.get(company).add(model);
		}else {
			mobiles.put(company, new ArrayList<String>());
			mobiles.get(company).add(model);
		}
		return "model successfully added";
	}
	public List<String> getModels(String company){
		return mobiles.get(company);
	}
	public String buyMobile(String company,String model) {
		if(mobiles.containsKey(company)) {
			List<String> companyMobiles=mobiles.get(company);
			if(companyMobiles.contains(model)) {
				companyMobiles.remove(model);
				return "mobile sold succesfully";
			}else {
				return "item not available";
			}
		}else {
			return "item not available";
		}
	}

	public static void main(String[] args) {
		Mobile M1=new Mobile();
		System.out.println(M1.addMobile("Oppo", "K3"));
		System.out.println(M1.getModels("Oppo"));
		System.out.println(M1.buyMobile("Oppo", "K3"));

	}

}
