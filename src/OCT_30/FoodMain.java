package OCT_30;

abstract class Food{
	protected double proteins, fats, carbs, tastyScore;
	abstract void getMacroNutrients();
	public Food(double proteins, double fats, double carbs) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		
	}
	abstract int getTastyScore();
	abstract String getType() ;
	
}

class Egg extends Food{
	
	private final int tastyScore=7;
	private final String type ="non-vegetarian";
	public Egg(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
	}

	@Override
	void getMacroNutrients() {
		System.out.println("An egg has "+this.proteins+"gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}
	@Override
	public int getTastyScore() {
		return tastyScore;
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	
}
class Bread extends Food{
	
	private final int tastyScore=8;
	private final String type ="vegetarian";
	public Bread(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
	}

	@Override
	void getMacroNutrients() {
		System.out.println("A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}
	@Override
	public int getTastyScore() {
		return tastyScore;
	}
	
	@Override
	public String getType() {
		return type;
	}
	
}
public class FoodMain {

	public static void main(String[] args) {
		 Food[] foods = new Food[2];

	     foods[0] = new Egg(6.3, 5.0, 0.6); 

	        
	     foods[1] = new Bread(4.0, 1.1, 13.8); 

	       
	     for (Food food : foods) {
	            System.out.println("Food Type: "+food.getType() );
	            food.getMacroNutrients();
	            System.out.println("Taste Score: " + food.getTastyScore());
	            System.out.println();
		

	}

}
}
/*
Program 2 :
-----------
Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:

1. abstract class Food with the following properties:

double proteins
double fats
double carbs
double tastyScore
void getMacroNutrients [Abstract Method]

2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 

Create an ELC class Testing
The first line contains an integer, n, the number of food items.

Every food item takes input in the next 4 lines where the first line is the name of the food and the next three lines are method calls (getType, getTaste, and getMacros) 

Input :-
1
Bread
getType
getMacros
getTaste
Output :-

Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8
*/