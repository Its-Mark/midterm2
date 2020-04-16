import java.io.*;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args){
        if(args.length == 4){
            String sourceFile = args[0];
            String targetFile = args[1];
            String oldString = args[2];
            String newString = args[3];
            try{
                File input = new File(sourceFile);
                File out = new File(targetFile);
                FileWriter fw = new FileWriter(out);
                BufferedWriter bw = new BufferedWriter(fw);
                Scanner sc = new Scanner(input);
                while (sc.hasNextLine()){
                    String line = sc.nextLine();
                    line = line.replaceAll(oldString,newString);
                    bw.write(line + "\n");
                }
                bw.close();
                fw.close();
                System.out.println("Words have been changed.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("There were not enough parameters");
        }
    }
}

