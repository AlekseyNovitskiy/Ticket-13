public class Main {
    public static void main(String[] args) {
        //Задание 1.
        System.out.println("Задание 1");

        int[] number = {1,2,3,4,5,6,7,8,9};
        int[] numberReverse = new int[number.length];
        for (int i = number.length - 1; i >= 0; i--) {
            numberReverse[number.length - i - 1] = number[i];
        }
        for (int j :
                numberReverse) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Задание 2.
        System.out.println("Задание 2");

        String phone = "8 960   756 55 44";
        phone = phone.replace(" ", "");
        System.out.println(phone);
    }
}