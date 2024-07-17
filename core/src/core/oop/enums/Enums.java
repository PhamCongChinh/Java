package core.oop.enums;

enum Mobile {
	Samsung,
	Nokia,
	Iphone
}

enum WEEKDAY {
	MONDAY("Day 1"),
	TUESDAY("Day 2"),
	WEDNESDAY("Day 3"),
	THRUSDAY("Day 4"),
	FRIDAY("Day 5"),
	SATURDAY("Day 6"),
	SUNDAY("Day 7");
	
	private final String description;
	
	WEEKDAY(String description) {
		this.description = description;
	}
	public String getDescription () {
		return this.description;
	}
}

public class Enums {
	public static void main(String[] args) {
		System.out.println(Mobile.Iphone);
		
		Mobile mobile = Mobile.Nokia;
		
		if (mobile.equals(Mobile.Nokia)) {
			System.out.println("Matched");
		}
		System.out.println("-----");
		switch(mobile) {
        	case Samsung:
        		System.out.println("Samsung");
	           	break;
        	case Nokia:
        		System.out.println("Nokia");
        		break;
        	case Iphone:
        		System.out.println("Iphone");
		}
		System.out.println("---WEEKDAY---");
		System.out.println(WEEKDAY.FRIDAY.getDescription());
	}
}
