import java.util.Scanner;

class AlphaX{

public static void main(String [] a){

Scanner s=new Scanner(System.in);

System.out.println("Enter the number of rows");

long row=s.nextLong();

short M=5;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){

if(i==j || i+j==6){
System.out.print("* ");
}else
System.out.print("  ");
}
System.out.println();
}
}
}