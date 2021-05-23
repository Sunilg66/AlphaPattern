import java.util.*;

class AlphaJ{

public static void main(String[] args){

int i,j,n=8;

for(i=0;i<=n;i++){
for(j=0;j<=n;j++){

if(i==0 || j==n/2 || (i==n  &&( j!=5 && j!=6 && j!=7 && j!=8)) ||
 (j==0 &&(i!=1 && i!=2 && i!=3 && i!=4)))
System.out.print("*");

else
System.out.print(" ");

}
System.out.println();
}
}
}