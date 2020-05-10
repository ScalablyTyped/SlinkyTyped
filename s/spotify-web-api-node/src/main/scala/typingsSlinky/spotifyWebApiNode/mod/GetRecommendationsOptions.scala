package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationsOptions
  extends LimitOptions
     with MarketOptions {
  var max_acousticness: js.UndefOr[Double] = js.native
  var max_danceability: js.UndefOr[Double] = js.native
  var max_duration_ms: js.UndefOr[Double] = js.native
  var max_energy: js.UndefOr[Double] = js.native
  var max_instrumentalness: js.UndefOr[Double] = js.native
  var max_key: js.UndefOr[Double] = js.native
  var max_liveness: js.UndefOr[Double] = js.native
  var max_loudness: js.UndefOr[Double] = js.native
  var max_mode: js.UndefOr[Double] = js.native
  var max_popularity: js.UndefOr[Double] = js.native
  var max_speechiness: js.UndefOr[Double] = js.native
  var max_tempo: js.UndefOr[Double] = js.native
  var max_time_signature: js.UndefOr[Double] = js.native
  var max_valence: js.UndefOr[Double] = js.native
  var min_acousticness: js.UndefOr[Double] = js.native
  var min_danceability: js.UndefOr[Double] = js.native
  var min_duration_ms: js.UndefOr[Double] = js.native
  var min_energy: js.UndefOr[Double] = js.native
  var min_instrumentalness: js.UndefOr[Double] = js.native
  var min_key: js.UndefOr[Double] = js.native
  var min_liveness: js.UndefOr[Double] = js.native
  var min_loudness: js.UndefOr[Double] = js.native
  var min_mode: js.UndefOr[Double] = js.native
  var min_popularity: js.UndefOr[Double] = js.native
  var min_speechiness: js.UndefOr[Double] = js.native
  var min_tempo: js.UndefOr[Double] = js.native
  var min_time_signature: js.UndefOr[Double] = js.native
  var min_valence: js.UndefOr[Double] = js.native
  var seed_artists: js.UndefOr[js.Array[String] | String] = js.native
  var seed_genres: js.UndefOr[js.Array[String] | String] = js.native
  var seed_tracks: js.UndefOr[js.Array[String] | String] = js.native
  var target_acousticness: js.UndefOr[Double] = js.native
  var target_danceability: js.UndefOr[Double] = js.native
  var target_duration_ms: js.UndefOr[Double] = js.native
  var target_energy: js.UndefOr[Double] = js.native
  var target_instrumentalness: js.UndefOr[Double] = js.native
  var target_key: js.UndefOr[Double] = js.native
  var target_liveness: js.UndefOr[Double] = js.native
  var target_loudness: js.UndefOr[Double] = js.native
  var target_mode: js.UndefOr[Double] = js.native
  var target_popularity: js.UndefOr[Double] = js.native
  var target_speechiness: js.UndefOr[Double] = js.native
  var target_tempo: js.UndefOr[Double] = js.native
  var target_time_signature: js.UndefOr[Double] = js.native
  var target_valence: js.UndefOr[Double] = js.native
}

object GetRecommendationsOptions {
  @scala.inline
  def apply(): GetRecommendationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationsOptions]
  }
  @scala.inline
  implicit class GetRecommendationsOptionsOps[Self <: GetRecommendationsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_acousticness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_acousticness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_acousticness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_acousticness")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_danceability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_danceability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_danceability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_danceability")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_duration_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_duration_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_duration_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_duration_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_energy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_energy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_energy")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_instrumentalness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_instrumentalness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_instrumentalness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_instrumentalness")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_key(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_key")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_liveness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_liveness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_liveness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_liveness")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_loudness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_loudness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_loudness")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_mode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_popularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_popularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_popularity")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_speechiness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_speechiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_speechiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_speechiness")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_tempo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_tempo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_tempo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_tempo")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_time_signature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_time_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_time_signature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_time_signature")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_valence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_valence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_valence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_valence")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_acousticness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_acousticness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_acousticness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_acousticness")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_danceability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_danceability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_danceability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_danceability")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_duration_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_duration_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_duration_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_duration_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_energy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_energy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_energy")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_instrumentalness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_instrumentalness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_instrumentalness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_instrumentalness")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_key(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_key")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_liveness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_liveness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_liveness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_liveness")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_loudness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_loudness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_loudness")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_mode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_popularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_popularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_popularity")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_speechiness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_speechiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_speechiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_speechiness")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_tempo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_tempo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_tempo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_tempo")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_time_signature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_time_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_time_signature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_time_signature")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_valence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_valence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_valence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_valence")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed_artists(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed_artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed_artists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed_artists")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed_genres(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed_genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed_genres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed_genres")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed_tracks(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed_tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed_tracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed_tracks")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_acousticness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_acousticness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_acousticness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_acousticness")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_danceability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_danceability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_danceability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_danceability")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_duration_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_duration_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_duration_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_duration_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_energy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_energy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_energy")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_instrumentalness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_instrumentalness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_instrumentalness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_instrumentalness")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_key(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_key")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_liveness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_liveness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_liveness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_liveness")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_loudness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_loudness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_loudness")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_mode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_popularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_popularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_popularity")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_speechiness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_speechiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_speechiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_speechiness")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_tempo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_tempo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_tempo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_tempo")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_time_signature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_time_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_time_signature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_time_signature")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_valence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_valence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_valence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_valence")(js.undefined)
        ret
    }
  }
  
}

