import java.util.Scanner;

class AlphaH{

public static void main(String [] d){

Scanner s=new Scanner(System.in);

System.out.println("enter the number of rows");

byte row=s.nextByte();

short m=8;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){

if(j==1 || j==5 || i==3){
System.out.print("* ");
}else
System.out.print("  ");
}
System.out.println();
}
}
}
