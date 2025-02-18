package com.Identificationhandler;

public class IdentificationHandler {

    public boolean isValidId(String idNumber) {
        int sum = 0;
        for (int i = 0; i < idNumber.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(idNumber.charAt(i)));
            if ((i + 1) % 2 == 0) {
                digit *= 2;
                if (digit > 9) {

                    digit = (digit % 10) + (digit / 10);

                }
                sum += digit;
            } else {
                sum += digit;
            }
        }
        return sum % 10 == 0;
    }

}
