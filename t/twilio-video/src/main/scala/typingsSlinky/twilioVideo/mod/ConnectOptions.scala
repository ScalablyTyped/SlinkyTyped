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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends StObject {
  
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
  implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortOnIceServersTimeout(value: Boolean): Self = StObject.set(x, "abortOnIceServersTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortOnIceServersTimeoutUndefined: Self = StObject.set(x, "abortOnIceServersTimeout", js.undefined)
    
    @scala.inline
    def setAudio(value: Boolean | CreateLocalTrackOptions): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setAutomaticSubscription(value: Boolean): Self = StObject.set(x, "automaticSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticSubscriptionUndefined: Self = StObject.set(x, "automaticSubscription", js.undefined)
    
    @scala.inline
    def setBandwidthProfile(value: BandwidthProfileOptions): Self = StObject.set(x, "bandwidthProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthProfileUndefined: Self = StObject.set(x, "bandwidthProfile", js.undefined)
    
    @scala.inline
    def setDominantSpeaker(value: Boolean): Self = StObject.set(x, "dominantSpeaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantSpeakerUndefined: Self = StObject.set(x, "dominantSpeaker", js.undefined)
    
    @scala.inline
    def setDscpTagging(value: Boolean): Self = StObject.set(x, "dscpTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDscpTaggingUndefined: Self = StObject.set(x, "dscpTagging", js.undefined)
    
    @scala.inline
    def setEnableDscp(value: Boolean): Self = StObject.set(x, "enableDscp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDscpUndefined: Self = StObject.set(x, "enableDscp", js.undefined)
    
    @scala.inline
    def setIceServers(value: js.Array[RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersTimeout(value: Double): Self = StObject.set(x, "iceServersTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersTimeoutUndefined: Self = StObject.set(x, "iceServersTimeout", js.undefined)
    
    @scala.inline
    def setIceServersUndefined: Self = StObject.set(x, "iceServers", js.undefined)
    
    @scala.inline
    def setIceServersVarargs(value: RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceTransportPolicy(value: RTCIceTransportPolicy): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    @scala.inline
    def setInsights(value: Boolean): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setMaxAudioBitrate(value: Double): Self = StObject.set(x, "maxAudioBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAudioBitrateNull: Self = StObject.set(x, "maxAudioBitrate", null)
    
    @scala.inline
    def setMaxAudioBitrateUndefined: Self = StObject.set(x, "maxAudioBitrate", js.undefined)
    
    @scala.inline
    def setMaxVideoBitrate(value: Double): Self = StObject.set(x, "maxVideoBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVideoBitrateNull: Self = StObject.set(x, "maxVideoBitrate", null)
    
    @scala.inline
    def setMaxVideoBitrateUndefined: Self = StObject.set(x, "maxVideoBitrate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkQuality(value: Boolean | NetworkQualityConfiguration): Self = StObject.set(x, "networkQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkQualityUndefined: Self = StObject.set(x, "networkQuality", js.undefined)
    
    @scala.inline
    def setPreferredAudioCodecs(value: js.Array[AudioCodec]): Self = StObject.set(x, "preferredAudioCodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAudioCodecsUndefined: Self = StObject.set(x, "preferredAudioCodecs", js.undefined)
    
    @scala.inline
    def setPreferredAudioCodecsVarargs(value: AudioCodec*): Self = StObject.set(x, "preferredAudioCodecs", js.Array(value :_*))
    
    @scala.inline
    def setPreferredVideoCodecs(value: js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]): Self = StObject.set(x, "preferredVideoCodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredVideoCodecsUndefined: Self = StObject.set(x, "preferredVideoCodecs", js.undefined)
    
    @scala.inline
    def setPreferredVideoCodecsVarargs(value: (VideoCodec | VideoCodecSettings | VP8CodecSettings)*): Self = StObject.set(x, "preferredVideoCodecs", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTracks(value: js.Array[LocalTrack | MediaStreamTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: (LocalTrack | MediaStreamTrack)*): Self = StObject.set(x, "tracks", js.Array(value :_*))
    
    @scala.inline
    def setVideo(value: Boolean | CreateLocalTrackOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
