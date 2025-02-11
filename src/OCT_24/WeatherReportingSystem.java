package OCT_24;

class WeatherReport{
	public void generateReport() {
		System.out.println("Generic weather report");
	}
	public void generateReport(String location) {
		System.out.println("Generates  weather report at "+location);
	}
	public void generateReport(int year, int month, int day) {
		System.out.println("Generates a weather report for a specific date: "+day+"-"+month+"-"+year);
	}
}

class HourlyReport extends WeatherReport{
	 @Override
	 public void generateReport() {
	        System.out.println("Hourly weather report.");
	 }

	 public void generateReport(String location, int hour) {
	        System.out.println("Hourly weather report for location: " + location + " at " + hour + ":00");
	 }

	 public void generateReport(int year, int month, int day, int hour) {
	        System.out.println("Hourly weather report for date: " + year + "/" + month + "/" + day + " at " + hour + ":00");
	 }

}

public class WeatherReportingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherReport genericReport = new WeatherReport();
        genericReport.generateReport();
        genericReport.generateReport("New York");
        genericReport.generateReport(2024, 10, 24);

        System.out.println("\n");

        HourlyReport hourlyReport = new HourlyReport();
        hourlyReport.generateReport();
        hourlyReport.generateReport("Chicago", 15);
        hourlyReport.generateReport(2024, 10, 24, 12);

	}

}
/*
Ques - 2
--------
Scenario: Weather Reporting System

Base Class - WeatherReport:

Create a class named WeatherReport with the following features:
A method generateReport() that prints a generic weather report.
An overloaded method generateReport(String location) that generates a weather report for a specific location.
Another overloaded method generateReport(int year, int month, int day) that generates a weather report for a specific date.
Ensure that method overloading is used effectively to handle different parameter combinations.

Subclass - HourlyReport:

Create a subclass named HourlyReport that extends the WeatherReport class.
Override the base class's methods in the HourlyReport class to provide more detailed and specific hourly weather information.
Add two additional overloaded methods in the HourlyReport class:
A method to generate an hourly weather report for a specific location.
Another method to generate an hourly weather report for a specific date and hour.

ELC - WeatherReportingSystem:

Develop an ELC WeatherReportingSystem that demonstrates the use of the WeatherReport and HourlyReport classes.
Instantiate objects of both classes and invoke various methods to showcase different weather reporting scenarios.
*/
