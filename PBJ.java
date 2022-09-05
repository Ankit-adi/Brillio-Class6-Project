package Session6;

public class PBJ implements Menu{
		String item="Sandwich with Peanut butter Jam";
		String item2="Sandwich with Cheese Dip";
		String allergicItem;
		boolean isAllergic=false;
	@Override
	public String getfood() {
		if(allergicItem.equalsIgnoreCase("Peanut")) {
			return item2;
		}
		return item;
	}	
}


