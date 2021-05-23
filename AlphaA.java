import java.util.*;

class AlphaA{

public static void main(String[] a){

System.out.println("Started main () ");

byte n=5;

for (int i=1; i<= n; i++){

for (int j=1; j<=n; j++){
 
if(i==1 || i==3 || j==1 || j==n)

System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}