package typingsSlinky.twilioVideo.mod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.experimental.webrtc.RTCIceServer
import org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy
import typingsSlinky.twilioVideo.twilioVideoStrings.au1
import typingsSlinky.twilioVideo.twilioVideoStrings.br1
import typingsSlinky.twilioVideo.twilioVideoStrings.de1
import typingsSlinky.twilioVideo.twilioVideoStrings.gll
import typingsSlinky.twilioVideo.twilioVideoStrings.ie1
import typingsSlinky.twilioVideo.twilioVideoStrings.jp1
import typingsSlinky.twilioVideo.twilioVideoStrings.sg1
import typingsSlinky.twilioVideo.twilioVideoStrings.us1
import typingsSlinky.twilioVideo.twilioVideoStrings.us2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  var abortOnIceServersTimeout: js.UndefOr[Boolean] = js.native
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.native
  var automaticSubscription: js.UndefOr[Boolean] = js.native
  var bandwidthProfile: js.UndefOr[BandwidthProfileOptions] = js.native
  var dominantSpeaker: js.UndefOr[Boolean] = js.native
  var dscpTagging: js.UndefOr[Boolean] = js.native
  var enableDscp: js.UndefOr[Boolean] = js.native
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.native
  var iceServersTimeout: js.UndefOr[Double] = js.native
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.native
  var insights: js.UndefOr[Boolean] = js.native
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.native
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.native
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var networkQuality: js.UndefOr[Boolean | NetworkQualityConfiguration] = js.native
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec]] = js.native
  var preferredVideoCodecs: js.UndefOr[js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]] = js.native
  var region: js.UndefOr[au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll] = js.native
  var tracks: js.UndefOr[js.Array[LocalTrack | MediaStreamTrack]] = js.native
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortOnIceServersTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnIceServersTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortOnIceServersTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnIceServersTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: Boolean | CreateLocalTrackOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticSubscription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidthProfile(value: BandwidthProfileOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidthProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidthProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withDominantSpeaker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantSpeaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantSpeaker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantSpeaker")(js.undefined)
        ret
    }
    @scala.inline
    def withDscpTagging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dscpTagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDscpTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dscpTagging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDscp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDscp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDscp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDscp")(js.undefined)
        ret
    }
    @scala.inline
    def withIceServers(value: js.Array[RTCIceServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServers")(js.undefined)
        ret
    }
    @scala.inline
    def withIceServersTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServersTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceServersTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServersTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIceTransportPolicy(value: RTCIceTransportPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceTransportPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceTransportPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceTransportPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withInsights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insights")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel | LogLevels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAudioBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAudioBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAudioBitrateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioBitrate")(null)
        ret
    }
    @scala.inline
    def withMaxVideoBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVideoBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVideoBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVideoBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVideoBitrateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVideoBitrate")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withNetworkQuality(value: Boolean | NetworkQualityConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredAudioCodecs(value: js.Array[AudioCodec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredAudioCodecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredAudioCodecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredAudioCodecs")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredVideoCodecs(value: js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredVideoCodecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredVideoCodecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredVideoCodecs")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[LocalTrack | MediaStreamTrack]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Boolean | CreateLocalTrackOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

