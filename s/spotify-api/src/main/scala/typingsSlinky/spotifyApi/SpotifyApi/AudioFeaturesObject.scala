package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.audio_features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio Features Object
  * https://developer.spotify.com/web-api/object-model/#audio-features-object
  */
@js.native
trait AudioFeaturesObject extends js.Object {
  var acousticness: Double = js.native
  var analysis_url: String = js.native
  var danceability: Double = js.native
  var duration_ms: Double = js.native
  var energy: Double = js.native
  var id: String = js.native
  var instrumentalness: Double = js.native
  var key: Double = js.native
  var liveness: Double = js.native
  var loudness: Double = js.native
  var mode: Double = js.native
  var speechiness: Double = js.native
  var tempo: Double = js.native
  var time_signature: Double = js.native
  var track_href: String = js.native
  var `type`: audio_features = js.native
  var uri: String = js.native
  var valence: Double = js.native
}

object AudioFeaturesObject {
  @scala.inline
  def apply(
    acousticness: Double,
    analysis_url: String,
    danceability: Double,
    duration_ms: Double,
    energy: Double,
    id: String,
    instrumentalness: Double,
    key: Double,
    liveness: Double,
    loudness: Double,
    mode: Double,
    speechiness: Double,
    tempo: Double,
    time_signature: Double,
    track_href: String,
    `type`: audio_features,
    uri: String,
    valence: Double
  ): AudioFeaturesObject = {
    val __obj = js.Dynamic.literal(acousticness = acousticness.asInstanceOf[js.Any], analysis_url = analysis_url.asInstanceOf[js.Any], danceability = danceability.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instrumentalness = instrumentalness.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], liveness = liveness.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], speechiness = speechiness.asInstanceOf[js.Any], tempo = tempo.asInstanceOf[js.Any], time_signature = time_signature.asInstanceOf[js.Any], track_href = track_href.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valence = valence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFeaturesObject]
  }
  @scala.inline
  implicit class AudioFeaturesObjectOps[Self <: AudioFeaturesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcousticness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acousticness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalysis_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysis_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDanceability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("danceability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstrumentalness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentalness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiveness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoudness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeechiness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_signature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack_href(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: audio_features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

