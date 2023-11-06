public class SmsDemo {
    public static void main(String[] args) {
        Sms sms1 = new Sms("4888051");
        Sms sms2 = new Sms("494999");
        Sms sms3 = new Sms("4888051");

        System.out.println(sms1);
        sms1.readAs();

        System.out.println(sms2);
        sms2.readAs();

        System.out.println(sms3);
        sms3.readAs();

        if (sms1.getNumber().equals(sms2.getNumber())) {
            System.out.println("SMS Number 1 is equal to SMS Number 2");
        } else {
            System.out.println("SMS Number 1 is not equal to SMS Number 2");
        }

        if (sms1.getNumber().equals(sms3.getNumber())) {
            System.out.println("SMS Number 1 is equal to SMS Number 3");
        } else {
            System.out.println("SMS Number 1 is not equal to SMS Number 3");
        }
    }
}