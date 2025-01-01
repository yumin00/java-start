package src.condition;

public class Condition {
    public static void main(String[] args) {
        int a = 1;
        if (a == 1) {
            System.out.println("True");
        } else if (a == 3) {
            System.out.println("a is 3");
        }
        else {
            System.out.println("False");
        }

        int age = 25;
        int coupon;
        switch (age) {
            case 25:
                coupon = 1000;
                break;
            case 30:
                coupon = 2000;
                break;
            default:
                coupon = 5000;
        }
        System.out.println(coupon);


        int newAge = 25;
        int newCoupon = switch (age) {
            case 25 -> 1000;
            case 30 -> 2000;
            default -> 5000;
        };
        System.out.println(newCoupon);


        int yuminAge = 25;
        String status = (yuminAge >= 20) ? "성인" : "미성년자";
        System.out.println(status);
    }
}
