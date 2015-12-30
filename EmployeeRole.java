public class EmployeeRole {
	//每個Employee，都有一個名字屬性
	private String name;
	
	//每個Employee，會在0~多個SpecificFlight上服務
	private ArrayList<SpecificFlight> serviceList = new ArrayList<SpecificFlight>(0);
	
	//取得這個Employee的名字
	public String getName(){	
		return this.name;
	}
}
