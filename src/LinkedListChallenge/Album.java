package LinkedListChallenge;

import java.util.LinkedList;

/**
 * Created by robertsg on 12/17/2015.
 */
public class Album {
    private String name;
    private LinkedList<Song> songLinkedList = new LinkedList<>();

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongLinkedList() {
        return songLinkedList;
    }
}