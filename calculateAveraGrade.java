import java.util.Scanner;

/*
 * lessonNumber -> int
 * akts_letterGrade -> double[][] --> her satır bir ders her satırın ilk değeri ders kredisi ikinci değeri
 *                                --> her satırın ilk değeri ders kredisi ikinci değeri
 *  AA = 4.0
 *  AB = 3.7
 *  BA = 3.3
 *  BB = 3.0
 *  BC = 2.7
 *  CB = 2.3
 *  CC = 2.0
 *  CD = 1.7
 *  DC = 1.3
 *  DD = 1.0
 *  FF = 0.0
 *
 */

public class calculateAveraGrade {

    private static double convertGradetoNumber(String letterGrade){   /* harf notunu sayısal nota çevirmek için */
        return switch (letterGrade) {
            case "AA" -> 4.0;
            case "AB" -> 3.7;
            case "BA" -> 3.3;
            case "BB" -> 3.0;
            case "BC" -> 2.7;
            case "CB" -> 2.3;
            case "CC" -> 2.0;
            case "CD" -> 1.7;
            case "DC" -> 1.3;
            case "DD" -> 1.0;
            default -> 0.0;
        };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("write lesson number ? ");
        int lessonNumber = in.nextInt();

        double[][] akts_letterGrade = new double[lessonNumber][2];
        double totalLessonAKTS = 0.0 ;
        double totalAKTS = 0.0;



        for (int a = 0 ; a<lessonNumber ; a++){
            System.out.println("Write "+(a+1)+". akts :");
            akts_letterGrade[a][0]= in.nextDouble();                /* dersin kredisi alıp array'e kaydetme*/
            totalLessonAKTS += akts_letterGrade[a][0];               /* toplam ders kredisi değişkenine ekleme */
            System.out.println("write "+(a+1)+". letter Grade");
            akts_letterGrade[a][1]= convertGradetoNumber(in.next());     /* dersin harf notunu alıp yazılan methodla sayısal nota dönüştürüp array'e kaydetme */
            totalAKTS += akts_letterGrade[a][0]*akts_letterGrade[a][1];         /* toplam kredi değişkenine ekleme */
        }



        String[] result = String.valueOf((totalAKTS/totalLessonAKTS)).split("");  /* sonucun ilk dört basamağını almak için */
        System.out.println("Your average grade is "+result[0]+result[1]+result[2]+result[3]+" above 4 .");

    }
}
