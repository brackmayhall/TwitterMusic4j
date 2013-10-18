
package models.tracksresponse;

import java.util.List;

import models.common.artist.Artist;
import models.common.tracks.Tracks;
import models.common.user.User;

public class Response {
	
   	private Artist artist;
   	private List<Tracks> tracks;
   	private User user;

 	public Artist getArtist(){
		return this.artist;
	}
	public void setArtist(Artist artist){
		this.artist = artist;
	}
 	public List<Tracks> getTracks(){
		return this.tracks;
	}
	public void setTracks(List<Tracks> tracks){
		this.tracks = tracks;
	}
 	public User getUser(){
		return this.user;
	}
	public void setUser(User user){
		this.user = user;
	}
}
