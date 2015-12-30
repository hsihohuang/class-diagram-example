public class Booking {
	//每一筆booking，只能屬於一個passenger的
	private PassengerRole passenger;
	
	//每一筆booking，只能訂一個specificFlight
	private SpecificFlight specificFlight;
	
	Booking(PassengerRole passenger, SpecificFlight theSpecificFlight){
		this.passenger = passenger;//建立與這個passenger的link
		this.passenger.addLinkToBooking(this);//使這個passenger與booking建立link
		
		this.specificFlight = theSpecificFlight;//建立與這個specificFlight的link
		this.specificFlight.addLinkToBooking(this);//使這個specificFlight與booking建立link
	}
}
