import Networks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SocialMediaNetworksDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Please, dear sir/madam, input your username.");
        String userName = bReader.readLine();
        System.out.println("And we'd like you input your password at your earliest convenience as well pretty please...");
        String password = bReader.readLine();

        System.out.println("Dearest user, would you please humor us and enter a very witty message here: ");
        String message = bReader.readLine();

        String greeting = "\nChoose one of my awesome, top-of-the-line, fancy, unparalleled social networks for your time-wasting pleasure: \n1: Twacebook \n2: Fitter";
        System.out.println(greeting);
        int choice = Integer.parseInt(bReader.readLine());

        if (choice == 1) {
            network = new Twacebook(userName, password);
        } else if (choice == 2) {
            network = new Fitter(userName, password);
        }
        network.post(message);
    }
}
