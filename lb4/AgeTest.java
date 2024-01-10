public class AgeTest {
    public static void main(String[] args) {
        AgeChecker p = new AgeChecker();
        try {
            //p.setAge(18);
            p.setAge(-122);
        } catch (CustomAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
