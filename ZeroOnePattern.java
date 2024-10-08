package Assignment2;

public class ZeroOnePattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int columns = 4; // Number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print("0  ");
                } else {
                    System.out.print("1  ");
                }
            }
            System.out.println(); 
        }
    }
}
