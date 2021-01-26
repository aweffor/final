package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;

public class FileCounter {
    public int getFileNames(String filePath, String word) {
        File file = new File(filePath);
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                String searchKey = word;

                if (name.toLowerCase().startsWith(searchKey.toLowerCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        return fileNames.length;
    }

    public static void main(String[] args) {
        FileCounter fileCounter = new FileCounter();
        int filesNumber = fileCounter.getFileNames("C:\\Users\\MariamDZ\\Desktop\\BTU_DIRECTORY", "btu");

        System.out.println("ნაპოვნი ფაილების რაოდენობაა: " + filesNumber);
    }
}
