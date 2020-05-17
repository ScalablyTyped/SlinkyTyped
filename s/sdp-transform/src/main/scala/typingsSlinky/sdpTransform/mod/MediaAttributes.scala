package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.anon.App
import typingsSlinky.sdpTransform.anon.Attribute
import typingsSlinky.sdpTransform.anon.Attrs1
import typingsSlinky.sdpTransform.anon.Codec
import typingsSlinky.sdpTransform.anon.Config
import typingsSlinky.sdpTransform.anon.Dir1
import typingsSlinky.sdpTransform.anon.Direction
import typingsSlinky.sdpTransform.anon.Foundation
import typingsSlinky.sdpTransform.anon.Id
import typingsSlinky.sdpTransform.anon.IpVer
import typingsSlinky.sdpTransform.anon.Payload
import typingsSlinky.sdpTransform.anon.Semantics
import typingsSlinky.sdpTransform.anon.Value
import typingsSlinky.sdpTransform.anon.ValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaAttributes extends SharedAttributes {
  // a=candidate
  var candidates: js.UndefOr[js.Array[Foundation]] = js.native
  // a=crypto
  var crypto: js.UndefOr[Id] = js.native
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.native
  // a=fmtp
  var fmtp: js.Array[Config] = js.native
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.native
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[Attrs1]] = js.native
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
  var rids: js.UndefOr[js.Array[Direction]] = js.native
  var rtcp: js.UndefOr[IpVer] = js.native
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[js.Array[Payload]] = js.native
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[js.Array[Value]] = js.native
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[String] = js.native
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[String] = js.native
  var rtp: js.Array[Codec] = js.native
  // a=sctpmap
  var sctpmap: js.UndefOr[App] = js.native
  var simulcast: js.UndefOr[Dir1] = js.native
  var simulcast_03: js.UndefOr[ValueString] = js.native
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[Semantics]] = js.native
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[Attribute]] = js.native
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.native
}

object MediaAttributes {
  @scala.inline
  def apply(fmtp: js.Array[Config], rtp: js.Array[Codec]): MediaAttributes = {
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
    def withFmtp(value: js.Array[Config]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtp(value: js.Array[Codec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidates(value: js.Array[Foundation]): Self = {
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
    def withCrypto(value: Id): Self = {
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
    def withImageattrs(value: js.Array[Attrs1]): Self = {
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
    def withRids(value: js.Array[Direction]): Self = {
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
    def withRtcp(value: IpVer): Self = {
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
    def withRtcpFb(value: js.Array[Payload]): Self = {
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
    def withRtcpFbTrrInt(value: js.Array[Value]): Self = {
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
    def withSctpmap(value: App): Self = {
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
    def withSimulcast(value: Dir1): Self = {
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
    def withSimulcast_03(value: ValueString): Self = {
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
    def withSsrcGroups(value: js.Array[Semantics]): Self = {
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
    def withSsrcs(value: js.Array[Attribute]): Self = {
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

