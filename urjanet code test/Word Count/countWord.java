import java.io.*;
import java.util.*;

public class countWord {

/**
* read and print out the txt file on the console
* @param name name of the text file to be read
*/
    public static void readFile(String name){
        String fileName = name;
        String line = null; // Get one line at a time
        try {
            FileReader fileRead = new FileReader(fileName);
            // Wrap FileReader in BufferedReader.
            BufferedReader bufferedRead = new BufferedReader(fileRead);

            while((line = bufferedRead.readLine()) != null) {
                System.out.println(line);
            }   
            bufferedRead.close();  // Close files.       
        } catch(FileNotFoundException ex) {
            System.out.println("Cannot open file '" + fileName + "'");                
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
    }

/**
* create a dictionary with unique words of the text file to lookup in the next
* method which return the count of each words in the file read
* @param name the name of the file read
*/
    public static HashSet<String> makeWordDic(String name) throws FileNotFoundException{
        String fileName = name;
        Scanner sc = new Scanner(new FileInputStream(name));
        String str = "";
        HashSet<String> dic = new HashSet<>();

        while (sc.hasNextLine()) {
            str = sc.nextLine();
            String[] words = str.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("[^\\w]", "");
                words[i] = words[i].toLowerCase();
                dic.add(words[i]);
            }
            //System.out.println(Arrays.toString(words));
        }
        //System.out.println(dic);
        return dic;
    }

/**
* create a dictionary with unique words of the text file to lookup in the next
* method which return the count of each words in the file read
* @param name the name of the file read
*/
    public static ArrayList<String> count(String name, HashSet<String> h) throws FileNotFoundException{
        String fileName = name;
        Scanner sc = new Scanner(new FileInputStream(name));
        String str = "";
        //String[] temp;
        ArrayList<String[]> set = new ArrayList<>();
        ArrayList<String[]> whole = new ArrayList<>();
        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> count = new ArrayList<>();
        //String[] wholeText;

        while (sc.hasNextLine()) {
            str = sc.nextLine();
            String[] words = str.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                int c = 0;
                words[i] = words[i].replaceAll("[^\\w]", "");
                words[i] = words[i].toLowerCase();
            }
            // should copy Array here to merge the whole txt file to one big 
            // string Array.
            set.add(words); 
            //System.out.println(words);
            //System.out.println(Arrays.toString(words));
        }
        //System.out.println(set.get(0)[0]);
        for (String s : h) {
                wordsList.add(s); // convert Hashdet to ArrayList to have list
                                  // of words
        }


/**
* combine all string array to one big text
*/
        for (int m = 0; m < set.size() - 1; m++){
            String [] wholeText = merge(set.get(m),set.get(m+1));
            whole.add(wholeText);
            //System.out.println(whole);
            //System.out.println(Arrays.toString(wholeText));
        }



        for (int j = 0; j < whole.size(); j++){
            //String[] temp = set.get(j);
            int ind = 0;
            //System.out.println(j);
            while (ind < wordsList.size()){
                //System.out.println(j);
                int c = 0;
                for (int k = 0; k < whole.get(j).length; k++){
                    if(whole.get(j)[k].equals(wordsList.get(ind))){
                        c = c + 1;
                        
                    } 
                    // System.out.println(set.get(j)[k]);
                    // System.out.println(k);
                    // System.out.println(j);
                    // System.out.println(c);
                }
                str = wordsList.get(ind) + ": " + c;
                count.add(str);
                // str = " " + c;
                // count.add(str);
                // ind++;
                // System.out.println(c);
                //System.out.println(wordsList.get(ind));
                ind++;
            }

        //     //System.out.println(Arrays.toString(temp));
         }
        
        System.out.println(count);
        //System.out.println(words);
        //System.out.println(wordsList);

        return count;
    }


/**
* @return a String array which is the concanation of the two arrays passed in
* @param a, b String arrays to be merged
*/
    public static String[] merge(String[] a, String[] b) {
        int lOfa = a.length;
        int lOfb = b.length;
        String[] c = new String[lOfa + lOfb];
        System.arraycopy(a, 0, c, 0, lOfa);
        System.arraycopy(b, 0, c, lOfa, lOfb);
        return c;
    }
     
}
