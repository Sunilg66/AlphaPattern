import java.util.Scanner;

class AlphaL{

public static void main(String [] a){

Scanner s=new Scanner(System.in);

System.out.println("Enter the number of rows");

long row=s.nextLong();

float m=5.0f;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){

if(i==5 || j==1){
System.out.print("* ");
}else
System.out.print("  ");
}
System.out.println();
}
}
}