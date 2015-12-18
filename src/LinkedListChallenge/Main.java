package LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by robertsg on 12/17/2015.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Song> playList = new LinkedList<>();
    static ArrayList<Album> albumArrayList = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("|- Awesome Boom Box 2001 |-");
        printInstructions();
        testMethod();

        boolean quit = false;

        while (!quit) {
            System.out.println("\nSelect an option:\nRemember 0 is instructions.");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    listSongs();
                    break;
                case 2:
                    listAlbums();
                    break;
                case 3:
                    listPlayList();
                    break;
                case 4:
                    addAlbum();
                    break;
                case 5:
                    addSong();
                    break;
                case 6:
                    addSongToPlaylist();
                    break;
                case 7:
                    controlPanel();
                    break;
                case 8:
                    System.out.println("Quitting Application");
                    quit = true;
                    break;
                default:
                    System.out.println("Select the right option or we'll sing Friday...we'll do it!");
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("|- 0: Print Instructions");
        System.out.println("|- 1: List Songs");
        System.out.println("|- 2: List Albums");
        System.out.println("|- 3: List Playlist");
        System.out.println("|- 4: Add Album");
        System.out.println("|- 5: Add Song");
        System.out.println("|- 6: Add song to playlist");
        System.out.println("|- 7: Control Panel");
        System.out.println("|- 8: Quit");

    }

    private static void controlPanel() {
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("Welcome to Your Control Panel");
        boolean quit = false;
        boolean goingForward = true;

        if (playList.isEmpty()) {
            System.out.println("Add some songs to your playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
            System.out.println("Press option");
            System.out.println("<-1 | 2 | 3->");
            System.out.println("0: Exit | 4:Remove");
        }

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Returning to Admin Panel");
                    quit = true;
                    break;
                case 1:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("You're at the start of your list.");
                        goingForward = true;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        System.out.println("Now Playing " + listIterator.previous().getTitle());
                        goingForward = false;
                    } else {
                        System.out.println("Now Playing " + listIterator.next().getTitle());
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("You're at the end of your list.");
                        goingForward = false;
                    }
                    break;
                case 4:
                    System.out.println("Do you want to remove current song?");
                    String answer = scanner.next();
                    scanner.nextLine();
                    if (answer.equals("yes")) {
                        listIterator.remove();
                        System.out.println("Removed song");
                    }
                    break;
            }
        }
    }

    private static void listSongs() {
        for (Album album : albumArrayList) {
            System.out.println("\nAlbum : " + album.getName());
            for (Song song : album.getSongLinkedList()) {
                System.out.println("Song: " + song.getTitle() + " duration: " + song.getDuration());
            }
        }
    }

    private static void listAlbums() {
        System.out.println("List of Albums");
        for (Album album : albumArrayList) {
            System.out.println("Album: " + album.getName());
        }
    }

    private static void listPlayList() {
        System.out.println("PlayList");
        for (Song song : playList) {
            System.out.println(song.getTitle());
        }
    }

    private static boolean findAlbum(String albumName) {
        //If true cannot add album as it already exist in the array
        for (Album album : albumArrayList) {
            if (albumName.equals(album.getName())) {
                return true;
            }
        }
        return false;
    }

    private static void addAlbum() {
        scanner.useDelimiter("\\n");
        System.out.println("What's the name of the Album");
        String albumName = scanner.next();
        scanner.nextLine();
        if (findAlbum(albumName)) {
            System.out.println("Album already exist in library");
        } else {
            albumArrayList.add(new Album(albumName));
            System.out.println("Album " + albumName + " has been added. Don't forget to add songs!");
        }
    }

    private static Song findSong(String songName) {
        for (Album album : albumArrayList) {
            for (Song song : album.getSongLinkedList()) {
                if (songName.equals(song.getTitle())) {
                    return song;
                }
            }
        }
        System.out.println("Song not found please try again");
        return null;
    }

    private static void addSong() {
        scanner.useDelimiter("\\n");
        System.out.println("What's the name of the Album you want to add the song to?");
        String albumName = scanner.next();
        System.out.println("What's the name of the song");
        String songName = scanner.next();
        System.out.println("How long is " + songName);
        int duration = scanner.nextInt();
        scanner.nextLine();
        if (findAlbum(albumName)) {
            for (Album album : albumArrayList) {
                if (albumName.equals(album.getName())) {
                    Song newSong = new Song(songName, duration);
                    album.getSongLinkedList().add(newSong);
                    System.out.println("Song " + songName + " has been added to album " + albumName);
                }
            }
        } else {
            System.out.println("Was not able to add song check album name");
        }
    }


    private static void addSongToPlaylist() {
        scanner.useDelimiter("\\n");
        System.out.println("What song would you like to add to playlist?");
        String songName = scanner.next();
        scanner.nextLine();
        if (findSong(songName) != null) {
            playList.add(findSong(songName));
        }
    }

    private static void testMethod() {
        albumArrayList.add(new Album("TestAlbum1"));
        albumArrayList.add(new Album("Don't buy this!"));
        albumArrayList.add(new Album("It's album #3"));


        albumArrayList.get(0).getSongLinkedList().add(new Song("TestSong1", 100));
        albumArrayList.get(0).getSongLinkedList().add(new Song("TestSong2", 300));
        albumArrayList.get(0).getSongLinkedList().add(new Song("TestSong3", 400));
        albumArrayList.get(0).getSongLinkedList().add(new Song("TestSong4", 500));
        albumArrayList.get(0).getSongLinkedList().add(new Song("TestSong5", 600));
        albumArrayList.get(0).getSongLinkedList().add(new Song("TestSong7", 700));

        playList.add(findSong("TestSong1"));
        playList.add(findSong("TestSong2"));
        playList.add(findSong("TestSong3"));
        playList.add(findSong("TestSong4"));
        playList.add(findSong("TestSong5"));

        albumArrayList.get(1).getSongLinkedList().add(new Song("We said don't buy this", 100));
        albumArrayList.get(1).getSongLinkedList().add(new Song("How are you listening?", 100));
        albumArrayList.get(1).getSongLinkedList().add(new Song("Feed us we're poor", 100));

        albumArrayList.get(2).getSongLinkedList().add(new Song("It's song #1", 100));
        albumArrayList.get(2).getSongLinkedList().add(new Song("It's song #2", 100));

    }
}