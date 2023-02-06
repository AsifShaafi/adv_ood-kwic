import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Kwic {
    private List<String> lines;
    private final List<List<String>> shiftLines = new ArrayList<>();
    public void input(String file) {
        lines = readFile(file);
        System.out.println(lines);
    }

    public void circularShift() {
        for (String s : lines) {
            List<String> shiftingLines = new ArrayList<String>();
            String currentString = s;
            do {
                shiftingLines.add(currentString);

                ArrayList<String> currentLine = new ArrayList<String>(List.of(currentString.split(" ")));

                String topWord = currentLine.remove(0);

                currentLine.add(topWord);

                currentString = String.join(" ", currentLine);
            } while (!currentString.equals(s));

            shiftLines.add(shiftingLines);
        }
    }

    private List<String> readFile(String filePath) {
        List<String> fileData = new ArrayList<>();
        try {
            File dataFile = new File(filePath);
            Scanner fileReader = new Scanner(dataFile);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                fileData.add(data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return fileData;
    }
}
