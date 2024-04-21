import java.util.Scanner;

interface  InterfacePrimeNum{
   void prime();
}

class PrimeNum implements InterfacePrimeNum {
	public void prime(){
	int i, n, j, c;
	Scanner myInput = new Scanner(System.in);
	System.out.println("Enter the number till which you want prime numbers: ");
	n = myInput.nextInt();
	System.out.println("The Prime Numbers are: ");
	for(i=2; i<=n; i++){
    	c=0;
    	for(j=1; j<=i; j++){
        	if (i%j==0){
            	c++;
        	}
    	}
    	if(c==2){
        	System.out.println(i);
    	}
	}
	}
}

class Main{
	public static void main(String[] args){
    	InterfacePrimeNum obj = new PrimeNum();
    	obj.prime();
	}
}
