import java.util.*;

class AlphaC{

public static void main(String[] a){

System.out.println("Started main () ");

int n=4;

for (int i=1; i<= n; i++){

for (int j=1; j<=n; j++){
 
if(i==1 || j==1 || i==n)

System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}