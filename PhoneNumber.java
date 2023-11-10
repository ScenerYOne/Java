class PhoneNumber {
    private String number;

    public PhoneNumber() {

    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public int[] calFreq() {
        int[] digitFreq = new int[10];

        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                int digitValue = Character.getNumericValue(digit);
                digitFreq[digitValue]++;
            }
        }

        return digitFreq;
    }

    public String toString() {
        return number;
    }
}