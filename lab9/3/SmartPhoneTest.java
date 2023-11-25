import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SmartPhone> phones = new ArrayList<>();

        // Phone data initialization
        SmartPhone phone1 = new SmartPhone("0819866339", "Huawei", "Android", 8, 64);
        SmartPhone phone2 = new SmartPhone("0868884661", "iPhone", "iOS", 16, 128);
        SmartPhone phone3 = new SmartPhone("065899772", "Oppo", "Android", 4, 64);
        SmartPhone phone4 = new SmartPhone("0878884661", "iPhone", "iOS", 16, 128);
        SmartPhone phone5 = new SmartPhone("095899772", "Oppo", "Android", 8, 128);

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);

        // Creating Human object
        Human test = new Human("AAA", 26, "ID 38900005645", phones);
        System.out.println(test.toString());

        // Calculating total RAM and ROM
        int totalRAM = phones.stream().mapToInt(SmartPhone::getRam).sum();
        int totalROM = phones.stream().mapToInt(SmartPhone::getRom).sum();

        // Displaying phone details
        for (int i = 0; i < phones.size(); i++) {
            System.out.println((i + 1) + ". " + phones.get(i).toString());
        }

        System.out.println("================================================");
        System.out.println("Total RAM: " + totalRAM + " GB, Total ROM: " + totalROM + " GB");
        System.out.println();

        char choice;
        int number;
        System.out.println("Select search by:");
        System.out.println("1: Phone number");
        System.out.println("2: Brand");
        System.out.println("3: ROM");
        System.out.println("4: OS");

        do {
            System.out.print("Select: ");
            number = input.nextInt();
            input.nextLine(); // Consume newline
            
            switch (number) {
                case 1:
                    System.out.print("Enter phone number: ");
                    String phoneNumber = input.nextLine();
                    boolean found = false;
                    for (SmartPhone phone : phones) {
                        if (phone.getNumber().equals(phoneNumber)) {
                            System.out.println("AAA has 1 Smartphone: " + phone.getNumber());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("AAA does not have phone number " + phoneNumber);
                    }
                    break;

                case 2:
                    System.out.print("Enter brand: ");
                    String brand = input.nextLine();
                    boolean brandFound = false;
                    for (SmartPhone phone : phones) {
                        if (phone.getBrand().equalsIgnoreCase(brand)) {
                            System.out.println("AAA has 1 Smartphone: " + phone.getBrand());
                            brandFound = true;
                        }
                    }
                    if (!brandFound) {
                        System.out.println("AAA does not have " + brand );
                    }
                    break;

                case 3:
                    System.out.print("Enter ROM : ");
                    int romSize = input.nextInt();
                    input.nextLine(); // Consume newline
                    int count = 0;
                    StringBuilder matchingPhoneNumbers = new StringBuilder();
                    for (SmartPhone phone : phones) {
                        if (phone.getRom() == romSize) {
                            count++;
                            if (matchingPhoneNumbers.length() > 0) {
                                matchingPhoneNumbers.append(", ");
                            }
                            matchingPhoneNumbers.append(phone.getNumber());
                        }
                    }
                    if (count > 0) {
                        System.out.println("AAA has " + count + " smartphones with ROM " + romSize + " GB: " + matchingPhoneNumbers.toString());
                    } else {
                        System.out.println("No phones found with ROM " + romSize + " GB.");
                    }
                    break;

                case 4:
                    System.out.print("Enter OS: ");
                    String os = input.nextLine();
                    int osCount = 0;
                    StringBuilder matchingOSPhones = new StringBuilder();
                    for (SmartPhone phone : phones) {
                        if (phone.getOs().equalsIgnoreCase(os)) {
                            osCount++;
                            if (matchingOSPhones.length() > 0) {
                                matchingOSPhones.append(", ");
                            }
                            matchingOSPhones.append(phone.getNumber());
                        }
                    }
                    if (osCount > 0) {
                        System.out.println("AAA has " + osCount + " smartphones : "+ matchingOSPhones.toString());
                    } else {
                        System.out.println("No phones found with OS '" + os + "'.");
                    }
                    break;
            }

            System.out.print("Continue [y/n]: ");
            choice = input.next().charAt(0);
            input.nextLine(); // Consume newline left by nextChar

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Thanks for using "); 
    }
}



