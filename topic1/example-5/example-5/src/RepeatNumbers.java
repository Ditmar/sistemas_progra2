public class RepeatNumbers {
    public RepeatNumbers() {

    }
    public Boolean isNumber(String number) {
        String pattern = "^\\d+$";
        return number.matches(pattern);
    }
    public Boolean isCharacter(String character) {
        String pattern = "^[a-zA-Z]+$";
        return character.matches(pattern);
    }
    public String extendsNumbers(String input) {
        StringBuilder result = new StringBuilder("");
        char currentChar = '-';
        for (int i = 0; i < input.length(); i++) {
            char indexChar = input.charAt(i);
            if (isCharacter((indexChar + ""))) {
                currentChar = indexChar;
            }
            StringBuilder numberBuilder = new StringBuilder("");
            if (isNumber(indexChar + "")) {
                int j = i;
                while (j < input.length()) {
                    char nextNumbers = input.charAt(j);
                    if (isNumber(nextNumbers + "")) {
                        numberBuilder.append(nextNumbers);
                    } else {
                        break;
                    }
                    j++;
                }
            }
            int repeatNumbers = 0;
            if (!numberBuilder.toString().isEmpty()) {
                repeatNumbers = Integer.parseInt(numberBuilder.toString());
            }
            for (int k = 0; k < repeatNumbers; k++) {
                if (currentChar != '-') {
                    result.append(currentChar + "");
                }
                
            }

        }
        return result.toString();
    }

}
