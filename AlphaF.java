import java.util.*;

class AlphaF{

public static void main(String[] a){

int m=5;

for(int i=1; i<=m; i++){
for(int j=1; j<=m; j++){

if(i==1 || j==1 || i==3){

System.out.print("* ");
}else
System.out.print("  ");
}
System.out.println();
}
}
}