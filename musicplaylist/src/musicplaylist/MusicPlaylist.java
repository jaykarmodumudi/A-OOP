package musicplaylist;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<Song> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }


    public void addSong(String name) {
        playlist.add(new Song(name));
        System.out.println("Added: " + name);
    }

    
    public void removeSong(String name) {
        ListIterator<Song> iterator = playlist.listIterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Removed: " + name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Song not found: " + name);
        }
    }

    public void moveSong(String name, int newPosition) {
        ListIterator<Song> iterator = playlist.listIterator();
        Song songToMove = null;

        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getName().equalsIgnoreCase(name)) {
                songToMove = song;
                iterator.remove();
                break;
            }
        }

        if (songToMove != null && newPosition >= 0 && newPosition <= playlist.size()) {
            playlist.add(newPosition, songToMove);
            System.out.println("Moved: " + name + " to position " + (newPosition + 1));
        } else if (songToMove == null) {
            System.out.println("Song not found: " + name);
        } else {
            System.out.println("Invalid position: " + newPosition);
        }
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            int index = 1;
            for (Song song : playlist) {
                System.out.println(index + ". " + song);
                index++;
            }
        }
    }

    public static void main(String[] args) {
        MusicPlaylist musicPlaylist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        
        do {
            System.out.println("\nMusic Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String songName = scanner.nextLine();
                    musicPlaylist.addSong(songName);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    songName = scanner.nextLine();
                    musicPlaylist.removeSong(songName);
                    break;
                case 3:
                    System.out.print("Enter song name to move: ");
                    songName = scanner.nextLine();
                    System.out.print("Enter new position: ");
                    int newPosition = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    musicPlaylist.moveSong(songName, newPosition);
                    break;
                case 4:
                    musicPlaylist.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

