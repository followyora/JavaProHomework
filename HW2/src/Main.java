public class Main {
    public static class StringUtils {
        private StringUtils() {

        }

        public static String generateWord(int length) {
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < length; i++) {
                char randomChar = (char) ('a' + Math.random() * ('z' - 'a' + 1));
                word.append(randomChar);
            }
            return word.toString();
        }

        public static String generateNumeric(int length) {
            StringBuilder numericString = new StringBuilder();
            for (int i = 0; i < length; i++) {
                char randomDigit = (char) ('0' + Math.random() * ('9' - '0' + 1));
                numericString.append(randomDigit);
            }
            return numericString.toString();
        }

        public static String[] splitByFirst(String input) {
            int length = input.length();
            int separatorIndex = 0;

            for (int i = 0; i < length; i++) {
                char currentChar = input.charAt(i);
                if (!Character.isLetterOrDigit(currentChar)) {
                    separatorIndex = i;
                    break;
                }


            }
            String[] parts = new String[2];
            parts[0] = input.substring(0, separatorIndex);
            parts[1] = input.substring(separatorIndex);

            return parts;
        }

        public static boolean isNumeric(String strNum) {
            if (strNum == null || strNum.isEmpty()) {
                return false;
            }

            for (int i = 0; i < strNum.length(); i++) {
                if (!Character.isDigit(strNum.charAt(i))) {
                    return false;
                }
            }

            try {
                int numericValue = Integer.parseInt(strNum);
                return numericValue >= 0;
            } catch (NumberFormatException e) {
                return false;
            }
        }


        public static void main(String[] args) {


            /*
            //generateWord
            String generatedWord = generateWord(8);
            System.out.println("Generated word: " + generatedWord);

            //generateNumeric
            String generatedNumericString = generateNumeric(6);
            System.out.println("Genereted num string: " + generatedNumericString);

            //splitByFirst
            String text1 = "I love Java!";
            String[] result1 = splitByFirst(text1);
            System.out.println("Result a:");
            for (String part : result1) {
                System.out.println(part);
            }

            String text2 = "People! I love Java! YO!";
            String[] result2 = splitByFirst(text2);
            System.out.println("Result b:");
            for (String part : result2) {
                System.out.println(part);
            }

             */

            //isNumeric
            String numericString1 = "56789";
            boolean isNumeric1 = isNumeric(numericString1);
            System.out.println("Numbers only and here no negative number: " + isNumeric1);

            String numericString2 = "-56789";
            boolean isNumeric2 = isNumeric(numericString2);
            System.out.println("Numbers only and here no negative number: " + isNumeric2);
        }
    }

}