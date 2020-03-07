package clock;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);

	public Clock(int hour,int minute,int second) {
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
		
	}
	
	public void tick() {
//		while(true) {
			second.increase();
			if(second.getValue()==0) {
				minute.increase();
			}else if(minute.getValue()==0){
				hour.increase();
			}
//		}
//		System.out.println(print);
	}
	
	public  String print() {
		return String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
	}
	
//	public void start() {
//		while (true) {
//			minute.increase();
//			if (minute.getValue() == 0) {
//				hour.increase();
//			}
//			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
//		}
//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Clock clock = new Clock();
////		clock.start();
//	}

}
