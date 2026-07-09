import java.util.Scanner;

public class youtubeNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Nick Name");
        String nickName = scanner.nextLine();
        System.out.println("Add the niche / type of content you will be adding in your YT channel");
        String niche = scanner.nextLine();
        System.out.println("Your YT Channel Name can be: " +  nickName + " " + niche );
        scanner.close();
    }
}
