package Loopingstm;

public class Patterns {
	public static void main(String[] args) {

			

 for(int i=1;i<=4;i++) {
	for(int j = 1;j<=4;j++) {
		 System.out.print("* ");
	}
	System.out.println();
}
System.out.println("---------------");
for(int i=1;i<=4;i++) {
	for(int j = 1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
 
}
System.out.println("-----------------"); 
for(int i=1;i<=4;i++) {
	for(int j = 1;j<=4;j++) {
		System.out.print(j+ " ");
	}
	System.out.println();
}
System.out.println("-----------------"); 
for(int i=1;i<=4;i++) {
	for(int j=1;j<=4;j++) {
		if(i==1||i==4||j==1||j==4) {
		System.out.print("* ");
	}
		else {
			System.out.print("  ");
		}

}
	System.out.println();
}
System.out.println("---------------");
for(int i=1;i<=5;i++) {
	for(int j=1;j<=4;j++) {
		if(i+j==5||i==j) {
		System.out.print("* ");
	}
		else {
			System.out.print("  ");
		}

} System.out.println();
}
System.out.println("---------------");

for(int i=1;i<=5;i++) {
	for(int j=1;j<=4;j++) {
		if(i==j) {
		System.out.print("* ");
	}
		else {
			System.out.print("  ");
		}
		
	}
	System.out.println();
}


System.out.println("-----------");	
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=4;j++) {
		if(i+j==5) {
		System.out.print("* ");
	}
		else {
			System.out.print("  ");
		}
			}
	System.out.println();
}

}
}





