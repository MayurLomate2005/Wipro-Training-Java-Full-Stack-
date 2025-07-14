import java.util.Scanner;

// Video class
class video {
    String Videoname;
    boolean checkout;
    int rating;

    public video(String name) {
        this.Videoname = name;
        this.checkout = false;
        this.rating = 0;
    }

    String getname() {
        return Videoname;
    }

    void doCheckout() {
        this.checkout = true;
    }

    void doreturn() {
        this.checkout = false;
    }

    public void receiverating(int rating) {
        this.rating = rating;
    }

    public int getrating() {
        return rating;
    }

    public boolean getcheckout() {
        return checkout;
    }
}

// VideoStore class
class videostore {
    video[] store;
    int count;

    public videostore() {
        store = new video[100];
        count = 0;
    }

    void addvideo(String name) {
        store[count++] = new video(name.trim());
        System.out.println("Video \"" + name.trim() + "\" added successfully.");
    }

    void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getname().equalsIgnoreCase(name.trim())) {
                store[i].doCheckout();
                System.out.println("Checkout of \"" + name.trim() + "\" successful.");
                return;
            }
        }
        System.out.println("Video \"" + name.trim() + "\" not found.");
    }

    void doreturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getname().equalsIgnoreCase(name.trim())) {
                store[i].doreturn();
                System.out.println("Video \"" + name.trim() + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name.trim() + "\" not found.");
    }

    void receiverating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getname().equalsIgnoreCase(name.trim())) {
                store[i].receiverating(rating);
                System.out.println("Rating for \"" + name.trim() + "\" submitted successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name.trim() + "\" not found.");
    }

    void listinventory() {
        System.out.println("\n--- Video Inventory ---");
        if (count == 0) {
            System.out.println("No videos in inventory.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + store[i].getname()
                    + " | Checked Out: " + store[i].getcheckout()
                    + " | Rating: " + store[i].getrating());
        }
    }
}

// Main shop class
public class shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        videostore vs = new videostore();
        int choice;

        do {
            System.out.println("\n=== Video Store Menu ===");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            String name;
            int rating;

            switch (choice) {
                case 1:
                    System.out.print("Enter video name: ");
                    name = sc.nextLine();
                    vs.addvideo(name);
                    break;

                case 2:
                    System.out.print("Enter video name to checkout: ");
                    name = sc.nextLine();
                    vs.doCheckout(name);
                    break;

                case 3:
                    System.out.print("Enter video name to return: ");
                    name = sc.nextLine();
                    vs.doreturn(name);
                    break;

                case 4:
                    System.out.print("Enter video name to rate: ");
                    name = sc.nextLine();
                    System.out.print("Enter rating (1-5): ");
                    rating = sc.nextInt();
                    sc.nextLine(); // consume newline
                    vs.receiverating(name, rating);
                    break;

                case 5:
                    vs.listinventory();
                    break;

                case 6:
                    System.out.println("Thank you for using the Video Store!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }

        } while (choice != 6);

        sc.close();
    }
}
