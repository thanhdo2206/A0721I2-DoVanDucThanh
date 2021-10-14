package ss4_class_and_object.bai_tap.time_selection_sort;

public class Main {
	public static void main(String[] args) {
		StopWatch selection = new StopWatch();
		
		for(int i = 0 ; i < 10;i++) {
			selection.setEndTime(i);
		}
		
		System.out.println("ElapsedTime = " + selection.getElapsedTime());
		
	}
}
