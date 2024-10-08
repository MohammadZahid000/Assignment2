package Assignment2;

public class LetterPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int columns = 4; // Number of columns

        for (char i = 'A'; i < 'A' + rows; i++) {
            for (char j = i; j < i + columns; j++) {
                System.out.print(j + "  "); 
            }
            System.out.println(); 
        }
    }
}
