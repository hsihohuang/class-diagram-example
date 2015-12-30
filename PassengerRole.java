public class PassengerRole {
	//每一個Passenger，可以有0~多筆的訂單
	private ArrayList<Booking> bookingList = new ArrayList<Booking>(0);
	
	public void makeBooking(SpecificFlight theSpecificFlight){
		//訂位(產生booking物件)
		Booking thebooking = new Booking(this,theSpecificFlight);
	}
	
	void addLinkToBooking(Booking booking){
		//建立與Booking的連結
		bookingList.add(booking);
	}
}
