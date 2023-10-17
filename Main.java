import java.util.Scanner;
class Grade{
    public String grade(int avgper){
        switch (avgper / 10){
            case 10:
            return "A+";
            case 9:
            return "A";
            case 8:
            return "B+";
            case 7:
            return "B";
            case 6:
            return "C";
            case 5:
            return "D";
            default:
            return "F";
        }
    }
}
public class Main{
public static void main(String[] args){
Grade g=new Grade();
Scanner kb=new Scanner(System.in);

//taking i/p to know how many subjects are there:

System.out.println("Enter the total no of subjects:");
int totalsubj=kb.nextInt();
int totalmarks=0;

//taking and adding all marks:

for(int i=0; i<totalsubj; i++){
    System.out.println("Enter the marks obtained in subjects: "+ (i+1));
    int marks= kb.nextInt();
    totalmarks+= marks;
}

// calculation of %age:

int avgper= totalmarks/totalsubj;

// calculation of grade:

String Grade=g.grade(avgper);

System.out.println("Total marks obtained: "+totalmarks);
System.out.println("Total percentage obtained: "+avgper+"%");
System.out.println("Grade obtained: "+ Grade);

kb.close();
}
}

