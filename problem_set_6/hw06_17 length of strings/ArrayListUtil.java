//
// Complete the method in this class to print the length of each string
// all on one line separated by spaces
//

import java.util.ArrayList;
public class ArrayListUtil
{
   /**
    * prints length of each string in the arraylist all on one line
    * @param text the array list to process
    */
    public void getLengths(ArrayList<String> text)
    {
        // TODO: Use a loop to print the length of each string all on one line separated by spaces
        System.out.print(text.get(0).length());
        if(text.size() > 1) {
            for(int i = 1; i < text.size(); i++) {
                System.out.print(" " + text.get(i).length());
            }
        }
    }
}