public class ClassGrade {
    public static void main(String[] args) {
        int Grade = 92;
        if (Grade<= 100 && Grade >= 90){
            System.out.println(" A Grade ");
        }
        else if (Grade<= 89 && Grade >= 80)
            System.out.println(" B Grade ");
        else if (Grade <= 79 && Grade >= 70)
            System.out.println (" C Grade ");
        else if (Grade <= 69 && Grade >= 60)
            System.out.println (" D Grade ");
        else
            System.out.println (" F Grade");
    }
}

