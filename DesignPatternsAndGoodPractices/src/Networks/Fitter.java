package Networks;

public class Fitter extends Network {
    public Fitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nChecking the username and password...");
        System.out.println("Name: " +  this.userName);
        System.out.println("Password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Fitter, another excellent social network built by yours truly...");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on my superbly excellent new and disruptive social media network, Fitter...");
            return true;
        }
        return false;
    }

    @Override
    void logOut() {
        System.out.println("User: " + userName + " has been logged out from the world's most excellent and snazzy social media platform, Fitter. Tell your friends!");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
