package Session6;

public class Idlis {
	String item="Button Idli with coconut chutney";
	String item2="Button Idli with ketchup";
	String allergicItem;
	boolean isAllergic=false;

		public String getfood() {
			if(allergicItem.equalsIgnoreCase("coconut")) {
				return item2;
			}
			return item;
				
		}
}
