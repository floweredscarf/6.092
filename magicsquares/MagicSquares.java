package magicsquares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;

        List<List<Integer>> square = new ArrayList<>();
        
        // For each line in the file ...
        String line;
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            if (line.trim().isEmpty())
            {
                continue;
            }

            List<Integer> row = new ArrayList<>();

            String[] parts = line.split("\t");
            int sum = 0;
            try
            {
                for (String part : parts)
                {
                    int num = Integer.parseInt(part);
                    sum += num;
                    row.add(num);
                }
            } catch (NumberFormatException err)
            {
                System.err.println("NumberFormatException on line:\n" + line + "\n" + err.getMessage());
                isMagic = false;
                break;
            }

            square.add(row);

            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
        }

        column:
        for (int j = 0; j < square.size(); j++)
        {
            int columnSum = 0;
            for (int i = 0; i < square.size(); i++)
            {
                columnSum += square.get(i).get(j);
            }
            if (columnSum != lastSum)
            {
                isMagic = false;
                break column;
            }
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < square.size(); i++)
        {
            mainDiagonalSum += square.get(i).get(i);
        }
        if (mainDiagonalSum != lastSum)
        {
            isMagic = false;
        }

        int antiDiagonalSum = 0;
        for (int i = 0; i < square.size(); i++)
        {
            antiDiagonalSum += square.get(i).get(square.size() - 1 - i);
        }
        if (antiDiagonalSum != lastSum)
        {
            isMagic = false;
        }
        
        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "magicsquares/Mercury.txt", "magicsquares/Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}
