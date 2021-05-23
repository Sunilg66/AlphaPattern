import java.util.*;

class AlphaZ{

public static void main(String [] args){

Scanner k=new Scanner(System.in);

System.out.println("Enter the number of rows");

byte row=k.nextByte();

double s=5;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(i==1 || i==s || i+j==s+1){
System.out.print(" *");
}else

System.out.print("  ");
}
System.out.println();
}
}
}