package models.artistresponse;

import models.common.artist.*;
import models.common.user.*;

/**
 * base artist response.
 * @author Daniel
 *
 */
public class ArtistResponse {
	private Artist artist;
	private User user;

	public Artist getArtist() {
		return this.artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
