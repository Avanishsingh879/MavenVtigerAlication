package Com.crmVtigerApplication.Page.HomePage;

public class Home {
	
	public static void main(String args[]){
		
		int A=10;
		int B=20;
		System.out.println("Before swapping");
		System.out.println(A);
		System.out.println(B);
		swap(A,B);
		
	}
    public static void swap(int A,int B){
    	int temp=A;
    	A=B;
    	B=temp;
    	System.out.println("After swap");
    	System.out.println(A);
		System.out.println(B);
		
	    System.out.println("Selenium");
    }
}
