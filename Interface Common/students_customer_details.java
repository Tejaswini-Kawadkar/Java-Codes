interface Common{
	void accept();
	void display();
}

class Student implements Common{
	int sno;
	String sname;
	int tfee;
	public void accept(){
    	sno = 10;
    	sname = "Sonal";
    	tfee = 1500;
	}
	public void display(){
    	System.out.println("--------Student Details--------");
    	System.out.println("Serial Number: "+sno);
    	System.out.println("Student Name: "+sname);
    	System.out.println("Student term fee: "+tfee);
	}
}

class Customer implements Common{
	int cno;
	String cname,product;
	int qty, rate;
	public void accept(){
    	cno = 20;
    	cname = "Ruchir";
    	product = "Mouse";
    	qty = 2;
    	rate = 150;
	}
	public void display(){
System.out.println("--------Customer Details--------");
    	System.out.println("Customer Number: "+cno);
    	System.out.println("Customer Name: "+cname);
    	System.out.println("Product Name: "+product);
    	System.out.println("Quantity: "+qty);
    	System.out.println("Rate: "+rate);
	}
}

class Main{
	public static void main(String args[]) throws Exception{
    	char ch;
    	Common r;
    	System.out.println("Enter 1 for Student and Enter 2 for Customer");
    	ch = (char) System.in.read();
    	if(ch=='1')
    	r = new Student();
    	else
    	r = new Customer();
    	r.accept();
    	r.display();
	}
}
