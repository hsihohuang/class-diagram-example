public class SpecificFlight {

	//每一個SpecificFlight，最少有0個、最多1個airplane
	private Airplane airplane = null;
	
	//每一個SpecificFlight，最少有0個、最多1個flightLog
	private FlightLog flightLog = null;
	
	//每一個SpecificFlight，會有0~多個訂單
	private ArrayList<Booking> bookedList = new ArrayList<Booking>(0);
	
	//每一個SpecificFlight，會有0~多個空服人員
	private ArrayList<EmployeeRole> crewMember = new ArrayList<EmployeeRole>(0);

	
    public void SpecifyAirplane(Airplane theAirplane){
		this.airplane = theAirplane; //讓SpecificFlight建立對airplan的Link
		
		//建立airplan對SpecificFlight的Link
		this.airplane.addLinkToSpecificFlight(this);
    }
	
	public void createFlightLog(){
		//產生FlightLog物件，並建立link
		this.flightLog = new FlightLog(this);		
    }
	
	public void ChangeAirplane(Airplane airplane1, Airplane airplane2){
		this.airplane = airplane2;//把link改成與airplane2連結
		airplane1.deletLinkToSpecificFlight(this);//刪除在airplane1的link
		this.airplane.addLinkToSpecificFlight(this);//建立airplan對SpecificFlight的Link
    }	
	void addLinkToBooking(Booking booked){
		bookedList.add(booked);//與Booking建立Link
    }
    
	public EmployeeRole findCrewMenber(String name){
		Iterator<EmployeeRole> iterator = this.crewMember.iterator();
		while(iterator.hasNext()){
			EmployeeRole tmp = iterator.next();
			if(name.equals(tmp.getName()))//如果該空服員名字符合要找的人
				return tmp;//回傳空服員的物件
		}
		return null;//找不到則回傳null
    }
}
