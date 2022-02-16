package SongApp;
 import java.util.ArrayList;
import java.util.LinkedList;
 
    public class Album{

	private String sname;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String sname , String artist , ArrayList<Song> songs) {
		
		this.sname = sname;
		this.artist= artist;
		this.songs = new ArrayList<Song>();
	}
	
	public Album() {
		
	}
	public Song findSong(String name) {
		//using for each loop
		for(Song checkedSong : songs) {
			if(checkedSong.getName().equals(name)) return checkedSong;
		}
		return null;
	}
	public boolean addSong(String name , double duration) {
		if(findSong(name)==null) {
			songs.add(new Song(name , duration));
			System.out.println(name +"you have added the song in album successfully !");
			return true;
		}
		else {
			System.out.println("song with name" + name+ "already in your album . thank you");
			return false;
		}
	}
	
	public boolean addToPlayList (int trackNumber , LinkedList<Song> PlayList) {
		int index = trackNumber-1;
		if(index >0 && index <=this.songs.size()) {
			PlayList.add(this.songs.get(index));
			return true;
		}
		System.out.println("this album does not have song with tracknumber" +trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String name , LinkedList<Song> PlayList) {
		for(Song checkedSong : this.songs ) {
			if(checkedSong.getName().equals(name)) {
				PlayList.add(checkedSong);
				return true;
			}
			System.out.println("there is no such song in album");
			//turn false;
		}
		return false;
	}

	}


