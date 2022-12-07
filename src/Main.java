import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_2b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            listOfStrings.add(s);
        }

        int sum = 0;

        for(String st : listOfStrings){
            System.out.println(st.charAt(0) + "," + st.charAt(2) );
            if(st.charAt(0) == 'A' && st.charAt(2) == 'X') sum += (3 + 0);
            else if(st.charAt(0) == 'A' && st.charAt(2) == 'Y') sum += (1 + 3);
            else if(st.charAt(0) == 'A' && st.charAt(2) == 'Z') sum += (2 + 6);
            else if(st.charAt(0) == 'B' && st.charAt(2) == 'X') sum += (1 + 0);
            else if(st.charAt(0) == 'B' && st.charAt(2) == 'Y') sum += (2 + 3);
            else if(st.charAt(0) == 'B' && st.charAt(2) == 'Z') sum += (3 + 6);
            else if(st.charAt(0) == 'C' && st.charAt(2) == 'X') sum += (2 + 0);
            else if(st.charAt(0) == 'C' && st.charAt(2) == 'Y') sum += (3 + 3);
            else if(st.charAt(0) == 'C' && st.charAt(2) == 'Z') sum += (1 + 6);
        }

        System.out.println(sum);
    }
}