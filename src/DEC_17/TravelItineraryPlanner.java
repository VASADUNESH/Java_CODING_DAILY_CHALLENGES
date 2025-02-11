package DEC_17;
import java.util.*;
/**
 *
 Program-2
Travel Itinerary Planner:
Build a travel itinerary planner that organizes destinations, activities, and schedules for travelers using collections.

Activity:
Represents an activity with a name and schedule.
Contains a constructor to initialize the activity's details and getters to access these details.
Overrides the toString() method to provide a string representation of an activity.

Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.

ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.

TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.


Output:-
Destination: Paris
- Visit Eiffel Tower (Morning)
- Louvre Museum (Afternoon)

Destination: London
- British Museum (Morning)
- London Eye (Afternoon)
 */

class Activity{
	private String name, schedule;

	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}
	
	
}
class Destination{
	private String name;
	private ArrayList<Activity> activites;
	public Destination(String name) {
		super();
		this.name = name;
		this.activites = new ArrayList<>();
	}
	public void addActivity(Activity activity) {
		activites.add(activity);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Activity> getActivity() {
		return activites;
	}
	public void setActivity(ArrayList<Activity> activity) {
		this.activites = activity;
	}
	@Override
	public String toString() {
		return "Destination [name=" + name + ", activity=" + activites + "]";
	}
	
	
}
class ItineraryPlanner{
	private ArrayList<Destination> destinations;

	public ItineraryPlanner() {
		super();
		this.destinations = new ArrayList<>();
	}

	public ArrayList<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(ArrayList<Destination> destinations) {
		this.destinations = destinations;
	}
	public void addDestination(Destination destination) {
        destinations.add(destination);
    }
	@Override
	public String toString() {
		return "ItineraryPlanner [destinations=" + destinations + "]";
	}
	
	
}

public class TravelItineraryPlanner {

	public static void main(String[] args) {

		ItineraryPlanner itineraryPlanner = new ItineraryPlanner();
		 
		Destination d1 = new Destination("Paris");
		Destination d2 = new Destination("London");
		
		d1.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
		d1.addActivity(new Activity("Louvre Museum","Afternoon"));
		
		d2.addActivity(new Activity("British Museum", "Morning"));
		d2.addActivity(new Activity("London Eye", "Afternoon"));
		
		itineraryPlanner.addDestination(d1);
		itineraryPlanner.addDestination(d2);
		
		for (Destination destination : itineraryPlanner.getDestinations()) {
            System.out.println(destination);
            for (Activity activity : destination.getActivity()) {
                System.out.println(activity);
            }
        }
		
	}

}
