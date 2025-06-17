package Practice;

public class Numbers {
	public static void main(String[] args) {
	int x=10;
	int y=10;
	int z=10;
  
	if(x == y && y == z ) {
		System.out.println("All numbers are equal");
	}
	else if(x != y && y != z && z != x) {
		System.out.println("All given numbers are not equal");
	}
	else if(x == y || y ==z || z == x) {
		System.out.println("only two number are equal");
	}
	}
}
