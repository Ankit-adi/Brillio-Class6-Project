package Session6;


public class Frenchfries implements Menu {
	String item="FrenchFries with Ketchup";
	String item2="FrenchFries with Mayonese";
	String allergicItem;
	boolean isAllergic=false;

		public String getfood() {
			if(allergicItem.equalsIgnoreCase("Tomato")) {
				return item2;
			}
			return item;
				
		}
}
