public class Airplane {
	//一個Airplane，可能有0~多個的specificFlight
	private ArrayList<SpecificFlight> specificFlightList = new ArrayList<SpecificFlight>(0);
	
	void addLinkToSpecificFlight(SpecificFlight theSpecificFlight){
		//讓Airplane建立對這個SpecificFlight的link	
		specificFlightList.add(theSpecificFlight);	
    }
	void deletLinkToSpecificFlight(SpecificFlight theSpecificFlight){
		//讓Airplane刪除對這個SpecificFlight的link
		specificFlightList.remove(theSpecificFlight);
    }
}
