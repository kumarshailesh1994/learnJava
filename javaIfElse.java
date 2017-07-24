import java.util.Scanner; 
class javaIfElse{

public static void main(String [] args){

int indScore;
int ausScore;

Scanner sc=new Scanner(System.in);
System.out.println("Enter India Score");
indScore=sc.nextInt();
System.out.println("Enter Aus Score");
ausScore=sc.nextInt();

if(indScore>ausScore)
	System.out.println("India won by "+ (indScore-ausScore)); 

else if(indScore<ausScore)
        System.out.println("AUstralia won by "+ (ausScore-indScore));

else
	System.out.println("Awesome match !! It's a tie");
}
}
