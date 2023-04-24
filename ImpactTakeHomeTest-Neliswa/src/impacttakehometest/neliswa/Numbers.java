package impacttakehometest.neliswa;

import java.util.*;
import javax.swing.JOptionPane;

/**
 * @author Neliswa Mabaso
 */
public class Numbers implements NumRangeSum {

    public static void main(String[] args) {
        Numbers list = new Numbers();
        String nums = "98,100,101,102,103,104,107,110,10,178,180,185,189,192";
        
        try {
            Collection<Integer> collectionInput = (List<Integer>) list.collect(nums);
            String range;
            range = list.listNum(collectionInput);

            JOptionPane.showMessageDialog(null, "Below is the range : \n" + range);

        } catch (ClassCastException exc) {
            JOptionPane.showInputDialog(null, "Please review the string there might be a character");
        }
    }

    public String listNum(Collection<Integer> nums) {
        int count = 0;
        //this holds the range from the main class
        StringBuilder sb = new StringBuilder();

        //collection class created
        ArrayList<Integer> numList = new ArrayList<>(nums);
        int length = numList.size();
        int start;
        int next;
        for (int a = 0; a < length; a++) {
            // Code for the list of numbers
            if (a == length - 1) {
                if (!Objects.equals(numList.get(length - 2), numList.get(length - 1))) {
                    sb.append(numList.get(a)).append(",");
                }
                break;
            }
            // 'start' is the first element 
            start = numList.get(a);

            next = numList.get(a + 1);
            if (next == start + 1) {
                count++;
                int lowestBound = start;

                /*
                In general, if the list has a consistent range, add its head and tail, else break out of the loop
                Loop until range breaks - where the loop breaks is the upper limit of the current range.
                Take the beginning of the area and where it ends!!! 
                */
                for (int i = a + 1;; i++) {
                    start = numList.get(i);
                    next = numList.get(i + 1);

                    if (next == start + 1) {
                        count++;
                    } else {
                        a = i;
                        if (count != 0) {
                            sb.append(lowestBound).append(" - ").append(numList.get(i)).append(", "); 
                        }
                        break;
                    }
                }
                count = 0;
            } else {
                // these go through to the ones without a range
                sb.append(start).append(", ");
            }
        }
        //concatenation
        String ranges = sb.toString();
        return ranges.substring(0, ranges.length() - 1);
    }

    public Collection<Integer> collect(String nums) {
        //Code for comma ","
        String[] arrayOfString = nums.split(",");
        int[] integers = new int[arrayOfString.length];
//
        for (int i = 0; i < arrayOfString.length; i++) {
            integers[i] = Integer.parseInt(arrayOfString[i]);
        }

        // grouping the numbers
        Arrays.sort(integers);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < integers.length; i++) {
            list.add(integers[i]);

        }
        return list;
    }

    @Override
    public String sumCol(Collection<Integer> nums) {
    throw new UnsupportedOperationException("Not supported yet.");
    }
}
