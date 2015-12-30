public class FlightLog {
	//每一個FlightLog，只會屬於一個SpecificFlight
	private SpecificFlight theSpecificflight;
	
	FlightLog(SpecificFlight theSpecificflight){
		//讓FlightLog與SpecificFlight建立link
		this.theSpecificflight = theSpecificflight;		
    }
}
