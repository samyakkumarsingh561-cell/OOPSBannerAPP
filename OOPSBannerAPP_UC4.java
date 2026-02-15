/**
 * OOPSBannerApp - UC4 - Array & Loops
 * UC4: Print OOPS Banner using String Array and Enhanced For-Loop
 * 
 * Improvement over UC3:
 * - Stores all banner lines in a String array
 * - Uses enhanced for-loop to print lines
 * - Better modularity and reusability
 * - Easier to maintain and modify
 * 
 * @author Samyak
 * @version 4.0
 */

public class OOPSBannerAPP_UC4 {

    public static void main(String[] args) {
        // String array to store all banner lines
        String[] bannerLines = {
            String.join(" ", "***** ", " ", " ***** ", " ", " ****** ", " ", "******* "),
            String.join(" ", " ** ** ", " ", " ** ** ", " ", " ** ** ", " ", " ****"),
            String.join(" ", " ** ** ", " ", " ** ** ", " ", " ** ** ", " ", " ** "),
            String.join(" ", " ** ** ", " ", " ** ** ", " ", " ****** ", " ", "******* "),
            String.join(" ", " ** ** ", " ", " ** ** ", " ", " ** ", " ", "         **"),
            String.join(" ", " ** ** ", " ", " ** ** ", " ", " ** ", " ", "      ** **"),
            String.join(" ", " ***** ", " ", " ***** ", " ", " ** ", " ", "   ******* ")
        };

        // Enhanced for-loop to print all banner lines
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

}
