package models.common.artist;

/**
 * a twitter music artist.
 * @author Daniel
 *
 */
public class Artist {
	
   	private String artist_image;
   	private String artist_name;

 	public String getArtist_image(){
		return this.artist_image;
	}
	public void setArtist_image(String artist_image){
		this.artist_image = artist_image;
	}
 	public String getArtist_name(){
		return this.artist_name;
	}
	public void setArtist_name(String artist_name){
		this.artist_name = artist_name;
	}
}
