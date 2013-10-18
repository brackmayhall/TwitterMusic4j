import java.util.ArrayList;
import java.util.List;

import util.Endpoint;
import models.artistresponse.ArtistResponse;
import models.categoriesresponse.CategoriesResponse;
import models.common.tracks.Tracks;
import models.similarresponse.SimilarArtistsResponse;
import models.tracksresponse.TracksResponse;

/**
 * driver to test endpoints.
 * @author Daniel
 *
 */
public class TwitterMusicDiver {

	/**
	 * main entry point.
	 * @param args the args duhhh...
	 */
	public static void main(final String[] args) {
		TwitterMusic4j twitMusicMapper = new TwitterMusic4j();
		Endpoint endpoint = new Endpoint();

		List<CategoriesResponse> tempCategoriesResponses = new ArrayList<CategoriesResponse>();
		
		System.out.println("Getting SUPERSTARS_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.SUPERSTARS_ITUNES));
		System.out.println("Getting POPULAR_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.POPULAR_ITUNES));
		System.out.println("Getting EMERGING_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.EMERGING_ITUNES));
		System.out.println("Getting UNEARTHED_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.UNEARTHED_ITUNES));
		System.out.println("Getting HUNTED_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.HUNTED_ITUNES));
		
		System.out.println("Getting ALTERNATIVE_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.ALTERNATIVE_ITUNES));
		System.out.println("Getting COUNTRY_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.COUNTRY_ITUNES));
		System.out.println("Getting DANCE_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.DANCE_ITUNES));
		System.out.println("Getting ELECTRONIC_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.ELECTRONIC_ITUNES));
		System.out.println("Getting FOLK_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.FOLK_ITUNES));
		System.out.println("Getting METAL_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.METAL_ITUNES));
		System.out.println("Getting POP_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.POP_ITUNES));
		System.out.println("Getting RNB_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.RNB_ITUNES));
		System.out.println("Getting ROCK_ITUNES...");
		tempCategoriesResponses.add(twitMusicMapper.executeCategoriesGet(endpoint.ROCK_ITUNES));
		
		for (CategoriesResponse temp : tempCategoriesResponses) {
			List<Tracks> tempTracks =  temp.getResponse().getTracks();
			for (Tracks tempTrack : tempTracks) {
				System.out.println(tempTrack.getArtist_name() + " \t\t\t\t" + tempTrack.getTrack_name());
			}
		}
		
		
		
		SimilarArtistsResponse tempSimilarArtists = twitMusicMapper.getSimilarArtists("27195114");
		System.out.println(tempSimilarArtists.getResponse().getArtist().getArtist_name());
		

		
		TracksResponse tempTracks = twitMusicMapper.getArtistTracks("27195114");
		System.out.println(tempTracks.getResponse().getArtist().getArtist_name());
		
		
		ArtistResponse tempArtist = twitMusicMapper.getArtist("Drake");
		System.out.println(tempArtist.getUser().getName());

	}

}
