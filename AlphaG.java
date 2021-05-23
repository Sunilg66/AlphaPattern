import java.util.*;

class AlphaG{

public static void main(String[] args){

int i=8;
int j=8;
int n=8;

for(i=0;i<=n;i++){
for(j=0;j<=n/2;j++){

if (j==0 || (j==4 && (i!=1 && i!=2 && i!=3)) || 
((i==0 || i==n) && (j>0 && j<4)) || (i==4  &&(j==3 || j==5)))
System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
}
}