Question Explanation:

writing a Java program to calculate the sum of a list of integers using autoboxing and unboxing, along with methods to parse strings into their respective wrapper classes (e.g., Integer.parseInt()).

Code :

import java.util.ArrayList;
import java.util.List;

public class SimpleAutoboxingUnboxingSum {

    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(parseStringToInteger("30"));
        numbers.add(parseStringToInteger("40"));

        System.out.println("The sum of the list is: " + calculateSum(numbers));

        numbers.clear();

        numbers.add(parseStringToInteger("50"));
        numbers.add(parseStringToInteger("60"));
        numbers.add(parseStringToInteger("70"));

        System.out.println("The sum of the list is: " + calculateSum(numbers));

        numbers.clear();

        numbers.add(parseStringToInteger("80"));
        numbers.add(parseStringToInteger("invalid"));
        numbers.add(parseStringToInteger("90"));

        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}


Test Cases:

Test Case 1:
Input: 10, 20, 30, "40", "50"
Expected Output: The sum of the list is: 150
Description: The list contains a mix of primitive integers and integers parsed from strings.

Test Case 2:
Input: "100", "200", "300"
Expected Output: The sum of the list is: 600
Description: All values are parsed from strings, and the sum is calculated.

Test Case 3:
Input: "50", "invalid", "70"
Expected Output:
Invalid number format: invalid
The sum of the list is: 120
Description: One of the inputs is not a valid integer, so it's skipped, and the sum of valid values is calculated.
