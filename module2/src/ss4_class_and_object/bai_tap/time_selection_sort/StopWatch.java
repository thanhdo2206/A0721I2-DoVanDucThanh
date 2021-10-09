package ss4_class_and_object.bai_tap.time_selection_sort;

import java.util.Calendar;

public class StopWatch {
	private long startTime, endTime;

	public StopWatch() {

	}
	
	

	public long getStartTime() {
		return startTime;
	}



	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}



	public long getEndTime() {
		return endTime;
	}


	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}



	public void start() {
		startTime = Calendar.getInstance().getTimeInMillis();
	}

	public void stop() {
		endTime = Calendar.getInstance().getTimeInMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
}
