package LinkListChallenge;

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
    static ListIterator<Song> listIterator = playList.listIterator();

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
                    skipForward();
                    break;
                case 2:
                    skipBackward();
                    break;
                case 3:
                    replaySong();
                    break;
                case 4:
                    listSongs();
                    break;
                case 5:
                    listAlbums();
                    break;
                case 6:
                    listPlayList();
                    break;
                case 7:
                    addAlbum();
                    break;
                case 8:
                    addSong();
                    break;
                case 9:
                    removeSong();
                    break;
                case 10:
                    addSongToPlaylist();
                    break;
                case 11:
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
        System.out.println("|- 1: Skip Forward");
        System.out.println("|- 2: Skip Backward");
        System.out.println("|- 3: Replay Song");
        System.out.println("|- 4: List Songs");
        System.out.println("|- 5: List Albums");
        System.out.println("|- 6: List Playlist");
        System.out.println("|- 7: Add Album");
        System.out.println("|- 8: Add Song");
        System.out.println("|- 9: Remove Song");
        System.out.println("|- 10: Add song to playlist");
        System.out.println("|- 11: Quit");

    }

    private static void skipForward() {
        if (listIterator.hasNext()) {
            listIterator.next(); //throws CurrentModificationException
        }
    }

    private static void skipBackward() {

    }

    private static void replaySong() {

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
                Song newSong = new Song(songName, duration);
                album.getSongLinkedList().add(newSong);
                System.out.println("Song " + newSong + " has been added to album " + albumName);
            }
        } else {
            System.out.println("Was not able to add song check album name");
        }
    }

    private static void removeSong() {

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