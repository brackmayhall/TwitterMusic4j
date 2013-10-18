package models.similarresponse;

import java.util.List;

import models.common.tracks.Sources;

/**
 * the similar artists.
 * @author Daniel
 *
 */
public class Similar {
	
   	private String artist_image;
   	private String artist_name;
   	private String id;
   	private Number popularity;
   	private String screen_name;
   	private List<Sources> sources;
   	private boolean track_explicit;
   	private String track_id;
   	private String track_name;
   	private String twitter_id;
   	private String twitter_name;

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
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public Number getPopularity(){
		return this.popularity;
	}
	public void setPopularity(Number popularity){
		this.popularity = popularity;
	}
 	public String getScreen_name(){
		return this.screen_name;
	}
	public void setScreen_name(String screen_name){
		this.screen_name = screen_name;
	}
 	public List<Sources> getSources(){
		return this.sources;
	}
	public void setSources(List<Sources> sources){
		this.sources = sources;
	}
 	public boolean getTrack_explicit(){
		return this.track_explicit;
	}
	public void setTrack_explicit(boolean track_explicit){
		this.track_explicit = track_explicit;
	}
 	public String getTrack_id(){
		return this.track_id;
	}
	public void setTrack_id(String track_id){
		this.track_id = track_id;
	}
 	public String getTrack_name(){
		return this.track_name;
	}
	public void setTrack_name(String track_name){
		this.track_name = track_name;
	}
 	public String getTwitter_id(){
		return this.twitter_id;
	}
	public void setTwitter_id(String twitter_id){
		this.twitter_id = twitter_id;
	}
 	public String getTwitter_name(){
		return this.twitter_name;
	}
	public void setTwitter_name(String twitter_name){
		this.twitter_name = twitter_name;
	}
}
