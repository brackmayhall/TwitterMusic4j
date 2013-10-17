import java.util.ArrayList;
import java.util.List;
import util.Endpoint;
import models.Tracks;
import models.TwitMusicMap;

public class TwitterMusicDiver {

	public static void main(String[] args) {
		TwitMusicMapper twitMusicMapper = new TwitMusicMapper();
		Endpoint endpoint = new Endpoint();

		List<TwitMusicMap> tempMusic = new ArrayList<TwitMusicMap>();
		
		System.out.println("Getting SUPERSTARS_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.SUPERSTARS_ITUNES));
		System.out.println("Getting POPULAR_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.POPULAR_ITUNES));
		System.out.println("Getting EMERGING_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.EMERGING_ITUNES));
		System.out.println("Getting UNEARTHED_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.UNEARTHED_ITUNES));
		System.out.println("Getting HUNTED_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.HUNTED_ITUNES));
		
		System.out.println("Getting ALTERNATIVE_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.ALTERNATIVE_ITUNES));
		System.out.println("Getting COUNTRY_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.COUNTRY_ITUNES));
		System.out.println("Getting DANCE_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.DANCE_ITUNES));
		System.out.println("Getting ELECTRONIC_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.ELECTRONIC_ITUNES));
		System.out.println("Getting FOLK_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.FOLK_ITUNES));
		System.out.println("Getting METAL_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.METAL_ITUNES));
		System.out.println("Getting POP_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.POP_ITUNES));
		System.out.println("Getting RNB_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.RNB_ITUNES));
		System.out.println("Getting ROCK_ITUNES...");
		tempMusic.add(twitMusicMapper.executeChartGet(endpoint.ROCK_ITUNES));
		
		for (TwitMusicMap temp : tempMusic) {
			List<Tracks> tempTracks =  temp.getResponse().getTracks();
			for (Tracks tempTrack : tempTracks) {
				System.out.println(tempTrack.getArtist_name() + " \t\t\t\t" + tempTrack.getTrack_name());
			}
		}

	}

}
