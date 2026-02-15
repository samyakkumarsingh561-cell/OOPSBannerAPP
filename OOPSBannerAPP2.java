/**
 * OOPSBannerApp - Using StringBuilder
 * UC1: Print OOPS to Console using String Concatenation
 * @author Samyak
 * @version 3.0
 */

public class OOPSBannerAPP2 {

    public static void main(String[] args) {
        StringBuilder banner = new StringBuilder();
        
        banner.append("***** ").append(" ").append(" ***** ").append(" ").append(" ****** ").append(" ").append("******* ").append("\n");
        banner.append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ****").append("\n");
        banner.append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ** ").append("\n");
        banner.append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ****** ").append(" ").append("******* ").append("\n");
        banner.append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ** ").append(" ").append("         **").append("\n");
        banner.append(" ** ** ").append(" ").append(" ** ** ").append(" ").append(" ** ").append(" ").append("      ** **").append("\n");
        banner.append(" ***** ").append(" ").append(" ***** ").append(" ").append(" ** ").append(" ").append("   ******* ");
        
        System.out.println(banner.toString());
    }

}
