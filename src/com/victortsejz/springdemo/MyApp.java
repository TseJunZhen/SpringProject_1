package com.victortsejz.springdemo;

public class MyApp {

	Coach theTrackCoach = new TrackCoach();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
