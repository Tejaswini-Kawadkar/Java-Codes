interface Sky{
	public void sky();
}

class Tree implements Sky{
	public void sky(){
    	System.out.println("Tree");
	}
}

class Street implements Sky{
	public void sky(){
    	System.out.println("Street");
	}
}

class Main{
	public static void main(String[] args){
    	Sky[] sky = new Sky[5];
    	sky[0]= new Street();
    	sky[1]= new Tree();
    	sky[2]= new Tree();
    	sky[3]= new Street();
    	sky[4]= new Tree();
	 
    	for(int i = 0; i < sky.length; i++){
        	sky[i].sky();
    	}
	}
}
