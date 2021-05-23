import java.util.*;

class AlphaE{

static public void main(String [] a){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number of rows");

short row=sc.nextShort();

byte s=5;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){

if(i==1 || j==1 || i==3 || i==5){

System.out.print("* ");
}else
System.out.print("  ");
}
System.out.println();
}
}
}
