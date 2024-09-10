package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    static LinkedList<String> playlist = new LinkedList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addSong(sc); break;
                case 2: removeSong(sc); break;
                case 3: moveSong(sc); break;
                case 4: displayPlaylist(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }

    public static void addSong(Scanner sc) {
        System.out.print("Enter song name: ");
        String song = sc.nextLine();
        playlist.add(song);
        System.out.println("Song added.");
    }

    public static void removeSong(Scanner sc) {
        System.out.print("Enter song name to remove: ");
        String song = sc.nextLine();
        if (playlist.remove(song)) {
            System.out.println("Song removed.");
        } else {
            System.out.println("Song not found.");
        }
    }

    public static void moveSong(Scanner sc) {
        System.out.print("Enter current position of song: ");
        int currentIndex = sc.nextInt();
        System.out.print("Enter new position: ");
        int newIndex = sc.nextInt();
        sc.nextLine();

        if (currentIndex >= 0 && currentIndex < playlist.size() && newIndex >= 0 && newIndex <= playlist.size()) {
            String song = playlist.remove(currentIndex);
            playlist.add(newIndex, song);
            System.out.println("Song moved.");
        } else {
            System.out.println("Invalid positions.");
        }
    }

    public static void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ": " + playlist.get(i));
            }
        }
    }
}
