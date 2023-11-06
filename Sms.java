public class Sms {
     String number;

    public Sms(String number) {
        this.number = number;
    }

    public String getNumber(){
        return this.number;
    }
    
    public void readAs() {
        System.out.print("Read as: ");
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            switch (digit) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }
        System.out.println();
    }

    public String toString() {
        return "SMS Number: " + number;
    }

    
}

