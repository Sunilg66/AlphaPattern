import java.util.*;

class AlphaM{
public static void main(String[] args){


int i=7;
int j=7;
int n=7;

for(i=0;i<=n;i++){
for(j=0;j<=n;j++){

if(j==0 || j==n || ((i==j) && j>0 && j<4) ||(i==1 && j==5)||(i==2 && j==4))
System.out.print("*");
	
else
System.out.print(" ");

}
System.out.println();
}
}
}