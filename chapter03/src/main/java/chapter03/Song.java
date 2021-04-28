package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composeer;
	private int year;
	private int track;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposeer() {
		return composeer;
	}
	public void setComposeer(String composeer) {
		this.composeer = composeer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	public void show() {
		System.out.println("Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composeer=" + composeer
		+ ", year=" + year + ", track=" + track + "]");
    }
	

}
