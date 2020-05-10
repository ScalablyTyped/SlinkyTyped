package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.AnonApp
import typingsSlinky.sdpTransform.AnonAttribute
import typingsSlinky.sdpTransform.AnonAttrs1
import typingsSlinky.sdpTransform.AnonCodec
import typingsSlinky.sdpTransform.AnonConfig
import typingsSlinky.sdpTransform.AnonDir1
import typingsSlinky.sdpTransform.AnonDirection
import typingsSlinky.sdpTransform.AnonFoundation
import typingsSlinky.sdpTransform.AnonId
import typingsSlinky.sdpTransform.AnonIpVer
import typingsSlinky.sdpTransform.AnonPayload
import typingsSlinky.sdpTransform.AnonSemantics
import typingsSlinky.sdpTransform.AnonValue
import typingsSlinky.sdpTransform.AnonValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaAttributes extends SharedAttributes {
  // a=candidate
  var candidates: js.UndefOr[js.Array[AnonFoundation]] = js.native
  // a=crypto
  var crypto: js.UndefOr[AnonId] = js.native
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.native
  // a=fmtp
  var fmtp: js.Array[AnonConfig] = js.native
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.native
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[AnonAttrs1]] = js.native
  // a=maxptime
  var maxptime: js.UndefOr[Double] = js.native
  // a=mid
  var mid: js.UndefOr[String] = js.native
  // a=msid
  var msid: js.UndefOr[String] = js.native
  var ptime: js.UndefOr[Double] = js.native
  // a=remote-candidates
  var remoteCandidates: js.UndefOr[String] = js.native
  // a=rid
  var rids: js.UndefOr[js.Array[AnonDirection]] = js.native
  var rtcp: js.UndefOr[AnonIpVer] = js.native
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[js.Array[AnonPayload]] = js.native
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[js.Array[AnonValue]] = js.native
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[String] = js.native
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[String] = js.native
  var rtp: js.Array[AnonCodec] = js.native
  // a=sctpmap
  var sctpmap: js.UndefOr[AnonApp] = js.native
  var simulcast: js.UndefOr[AnonDir1] = js.native
  var simulcast_03: js.UndefOr[AnonValueString] = js.native
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[AnonSemantics]] = js.native
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[AnonAttribute]] = js.native
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.native
}

object MediaAttributes {
  @scala.inline
  def apply(fmtp: js.Array[AnonConfig], rtp: js.Array[AnonCodec]): MediaAttributes = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAttributes]
  }
  @scala.inline
  implicit class MediaAttributesOps[Self <: MediaAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFmtp(value: js.Array[AnonConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtp(value: js.Array[AnonCodec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidates(value: js.Array[AnonFoundation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(js.undefined)
        ret
    }
    @scala.inline
    def withCrypto(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrypto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOfCandidates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfCandidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOfCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfCandidates")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerate(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(js.undefined)
        ret
    }
    @scala.inline
    def withImageattrs(value: js.Array[AnonAttrs1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageattrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageattrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageattrs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxptime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxptime")(js.undefined)
        ret
    }
    @scala.inline
    def withMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(js.undefined)
        ret
    }
    @scala.inline
    def withMsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msid")(js.undefined)
        ret
    }
    @scala.inline
    def withPtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ptime")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteCandidates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteCandidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteCandidates")(js.undefined)
        ret
    }
    @scala.inline
    def withRids(value: js.Array[AnonDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rids")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcp(value: AnonIpVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcp")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcpFb(value: js.Array[AnonPayload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpFb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcpFb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpFb")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcpFbTrrInt(value: js.Array[AnonValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpFbTrrInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcpFbTrrInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpFbTrrInt")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcpMux(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpMux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcpMux: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpMux")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcpRsize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpRsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcpRsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpRsize")(js.undefined)
        ret
    }
    @scala.inline
    def withSctpmap(value: AnonApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sctpmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSctpmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sctpmap")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulcast(value: AnonDir1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulcast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulcast")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulcast_03(value: AnonValueString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulcast_03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulcast_03: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulcast_03")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrcGroups(value: js.Array[AnonSemantics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrcGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrcs(value: js.Array[AnonAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrcs")(js.undefined)
        ret
    }
    @scala.inline
    def withXGoogleFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xGoogleFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXGoogleFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xGoogleFlag")(js.undefined)
        ret
    }
  }
  
}

