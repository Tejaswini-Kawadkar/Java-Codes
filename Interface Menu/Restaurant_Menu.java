interface Menu
{
	public void showMenu();
}

class VegMenu implements Menu
{
	public void showMenu()
	{
    	System.out.println("Idly");
    	System.out.println("Dosa");
    	System.out.println("Vada");
	}
	 
}

class NonVegMenu implements Menu
{
	public void showMenu()
	{
    	System.out.println("Chicken Biryani");
    	System.out.println("Tandoori Chicken");
	}
	 
}

class HotelServiceStaff
{
	private VegMenu vegMenu;
	private NonVegMenu nonVegMenu;
	 
	public HotelServiceStaff()
	{
    	this.vegMenu=new VegMenu();
    	this.nonVegMenu=new NonVegMenu();
	}
	 
	public void showVegMenu()
	{
    	this.vegMenu.showMenu();
	}
	 
	public void showNonVegMenu()
	{
this.nonVegMenu.showMenu();
	}
	 
	public void showVegNonVegMenu()
	{
    	this.vegMenu.showMenu();
    	this.nonVegMenu.showMenu();
	}
	 
}

class Main{
	public static void main(String[] args){
    	HotelServiceStaff hotelServiceStaff=new HotelServiceStaff();
    	 
    	System.out.println("Veg Menu");
    	hotelServiceStaff.showVegMenu();
    	 
    	System.out.println("--------");
    	System.out.println("Non-Veg Menu");
    	hotelServiceStaff.showNonVegMenu();
    	 
    	System.out.println("--------");
    	System.out.println("Veg & Non-Veg Menu");
    	hotelServiceStaff.showVegNonVegMenu();
	}
}
