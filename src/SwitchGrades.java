public class SwitchGrades {
    public static void main(String[] args) {
        String grade = "C";

        switch(grade) {
            case "A+":
                System.out.println("Awesome");
                break;
            case "B":
                System.out.println("Good but not great");
                break;
            case "C":
                System.out.println("Poor");
                break;
        }
    }
}
