public class AgeChecker {
    private int age;//для хранения

    public void setAge(int age) throws CustomAgeException {

        if (age < 0 || age >= 120) {
            throw new CustomAgeException("age is incorrect");
        }
        this.age = age;
    }
}
