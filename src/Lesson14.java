public class Lesson14 {
    public static void main(String[] args) {

        //REGEX
        // A*s -- Ananass
        // A.*s -- In between can be anything
        // ^Lorem -- matches with "Lorem ipsum..."
        // Contains only from alphanumeric a..z (lower case)
        // [a-z]+    -- matches 1 or more
        // [a-zA-Z]  -- matches lower and capital cases
        // \\d == [0-9]  -- matches small numbers

        ///////Validate year in range 1900 - 2100
        String validInput = "2020";
        String invalidInput = "99999";

        ////build a pattern to validate a year
        //Good example but we can do better
        if (validInput.matches("\\d\\d\\d\\d")){
            System.out.println("Valid input is a valid year.");
        }else {
            System.out.println("Not a valid year!");
        }

        //Validating each number - still have issues
        if (validInput.matches("[1-2][019]\\d\\d")){    //First num - 1 or 2; Second - 0, 1 or 9; Third and Fourth - any number
            System.out.println("Valid input is a valid year. Even 29xx");
        }else {
            System.out.println("Not a valid year!");
        }

        //Separating first 2 digits, but still 2100 not accepted
        if ("2100".matches("(19|20)\\d\\d")){
            System.out.println("Valid input is a valid year. ");
        }else {
            System.out.println("Not a valid year!");
        }

        //Finished example! Grouping OR statements
        if ("2100".matches("((19|20)\\d\\d|2100)")){
            System.out.println("Valid input is a valid year.");
        }else {
            System.out.println("Not a valid year!");
        }

    }
}
