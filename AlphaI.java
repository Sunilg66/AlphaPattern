import java.util.*;

class AlphaI{

public static void main(String[] args){
int i=8;
int j=8;
int n=8;

for(i=0;i<=n;i++){
for(j=0;j<=n/2;j++){

if(i==0 || i==n || j==2)
System.out.print("*");
else
System.out.print(" ");
}

System.out.println();
}
}
}