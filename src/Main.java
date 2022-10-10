public class Main {
    public static void main(String[] args) {
        int x = 100;
        if(x > 100) {
            System.out.println("123123");
        } else if(x < 0 || x != -1) {
            // другая логика
        } else {

        }
        // тернарный оператор
        boolean flag = true;
        if(!flag) {
            System.out.println("123");
        } else {
            System.out.println("456");
        }
        System.out.println(!flag ? "123" : "456");

        // && - Логическое И
        // || - Логическое ИЛИ
        // ==
        // !=

        int y = 5;
        switch(y) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3,4,5:
                System.out.println("3,4,5");
                break;
            default:
                System.out.println("Default");

        }
        int z = 0;
        if(flag) {
            z = 400;
        }
        z = 100;

        double b = 5.634;
        System.out.printf("%.2f",b); // 5.63

    }
}