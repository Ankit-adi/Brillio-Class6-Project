package Session6;

public class Nachos implements Menu{
	String item="Nachos with cheese dip";
	String item2="Nachos with hamas";
	String allergicItem;
	boolean isAllergic=false;
	@Override
	public String getfood() {
		if(allergicItem.equalsIgnoreCase("Cheese")) {
			return item2;
		}
		return item;
			
	}

}
