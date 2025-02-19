import java.util.*;
import java.text.DecimalFormat;
public class CgpaCal{
    
    public static void main(String[] args) {
        
        double grade_points=0;
        double credit_points=0;
        double overall_sgpa=0;
        String pattern="#.##";
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of semesters");
        int semesters=s.nextInt();
        for(int i=1;i<=semesters;i++) {
            System.out.println("enter value of sgpa"+i);
            double sgpa_sem_wise=s.nextDouble();
            
            if(sgpa_sem_wise==0) {
                System.out.println("enter number of subjects in that semister");
                int subjects=s.nextInt();
                
                for(int j=1;j<=subjects;j++) {
                    System.out.println("enter credits of subject "+j);
                    double credits=s.nextDouble();
                    System.out.println("enter grade of subject"+j);
                    double grade=s.nextDouble();
                    grade_points+=grade*credits;
                    credit_points+=credits;
                    sgpa_sem_wise=grade_points/credit_points;
                    System.out.println(sgpa_sem_wise);
                    
                    DecimalFormat d=new DecimalFormat(pattern);
                    System.out.println("sgpa:"+d.format(sgpa_sem_wise));
                    
                    
                    
                }
                
            }
            overall_sgpa+=sgpa_sem_wise;
            double cgpa=overall_sgpa/semesters;
            double cgpa_percentage=cgpa*9.5;
            DecimalFormat dfFormat=new DecimalFormat(pattern);
            System.out.println("sgpa:"+dfFormat.format(cgpa));
            System.out.println("sgpa:"+dfFormat.format(cgpa_percentage));
            
            
        }
        s.close();
        
    }
}
