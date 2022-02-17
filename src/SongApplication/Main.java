package SongApplication;


	
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album obj= new Album("album01" , "selena" ,);
		
		obj.addSong("Selfish Love" ,4.5);
		obj.addSong("Rare" ,4.5);
		obj.addSong("Dance Again" ,4.5);
		Album album;
		albums.add(album);
		
		obj =new Album();
		
		obj.addSong("" ,4.5);
		obj.addSong("Tu hi hai" ,4.5);
		obj.addSong("Phir mohhabbat" ,4.5);
		obj.addSong("Tum hi ho" ,4.5);
		albums.add(album);
		
		
		LinkedList<Song> playList_1 = new LinkedList<>();
		albums.get(0).addToPlayList("Selfish Love", playList_1);
		albums.get(0).addToPlayList("Rare", playList_1);
		albums.get(1).addToPlayList("Tum hi ho", playList_1);
		
		play(playList_1);
	
	}
	private static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<Song> listIterator =playList.listIterator();
		
		if(playList.size()==0) {
			
			System.out.println("this playlist has no song");
		}else {
			System.out.println("now playing " +listIterator.next().toString());
			menu();
		}
		
		while(!quit) {
			int action = sc.nextInt();
			sc.nextInt();
			
			switch(action) {
			
			case 0:
				System.out.println("Playlist complete");
				quit=true;
				break;
				
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward=true;
				}
				if(listIterator.hasNext()) {
					System.out.println("now playing " +listIterator.next().toString());
				}else {
					System.out.println("no song available for next");
					forward =false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("now playing" +listIterator.previous().toString());
				}else {
					System.out.println("first song is playing , there no such previous song");
					forward= false;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("now playing " +listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println(" first song is playing , there no such previous song");
					}
				}else {
						if(listIterator.hasNext()) {
							System.out.println("now playing " +listIterator.previous().toString());
							forward = true;
						}else {
							System.out.println("end of list");
						}
					}
					break;
			case 4:
				printList(playList);
				break;
			case 5:
				menu();
				break;
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now playing" +listIterator.next().toString());
					}else {
						if(listIterator.hasPrevious()) {
							System.out.println("now playing" +listIterator.previous().toString());
						}
					}
				}
				
				}
			}
		}
		
	
	private static void menu() {
		
		System.out.println("options are available press something");
		System.out.println("0 to quit /n"+ " 1 - to play next song\n" +"2 for previous song \n" + " 3 for replay\n"+" 4 for list \n" +"5 for aavail more option\n"+
						"6 for delete current song");
		
		
		
		}
	public static void printList(LinkedList<Song> playList) {
		
		Iterator<Song> iterator =playList.iterator();
		System.out.println("______");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("______");
	}
	}

