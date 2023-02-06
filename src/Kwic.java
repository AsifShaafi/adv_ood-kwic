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
    
    public void alphabetizing() {
        Map<String, Integer> shiftedLineMap = new HashMap<>();

        for (int i = 0; i < shiftLines.size(); i++) {
            List<String> lines = shiftLines.get(i);
            for (String line :
                    lines) {
                shiftedLineMap.put(line, i);
            }
        }

        linesWithIndex = sortLines(shiftedLineMap);

    }

    public void output() {
        for (String indexedLines :
                linesWithIndex.keySet()) {
            System.out.printf("%s\t\t\tline: %d\n", indexedLines, linesWithIndex.get(indexedLines));
        }
    }

    private Map<String, Integer> sortLines(Map<String, Integer> map) {

        return new TreeMap<>(map);
    }
}
