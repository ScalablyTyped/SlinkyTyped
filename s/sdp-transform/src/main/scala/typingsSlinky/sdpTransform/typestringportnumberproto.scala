package typingsSlinky.sdpTransform

import typingsSlinky.sdpTransform.sdpTransformStrings.inactive
import typingsSlinky.sdpTransform.sdpTransformStrings.recvonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :string,   port  :number,   protocol  :string,   payloads ? :string} & sdp-transform.sdp-transform.MediaDescription */
@js.native
trait typestringportnumberproto extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[js.Array[AnonLimit]] = js.native
  // a=candidate
  var candidates: js.UndefOr[js.Array[AnonFoundation]] = js.native
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[AnonIp] = js.native
  // a=control
  var control: js.UndefOr[String] = js.native
  // a=crypto
  var crypto: js.UndefOr[AnonId] = js.native
  // i=
  var description: js.UndefOr[String] = js.native
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.native
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.native
  // a=extmap
  var ext: js.UndefOr[js.Array[AnonUri]] = js.native
  var fingerprint: js.UndefOr[AnonHash] = js.native
  // a=fmtp
  var fmtp: js.Array[AnonConfig] = js.native
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.native
  var icePwd: js.UndefOr[String] = js.native
  var iceUfrag: js.UndefOr[String] = js.native
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[AnonAttrs1]] = js.native
  var invalid: js.UndefOr[js.Array[AnonValueString]] = js.native
  // a=maxptime
  var maxptime: js.UndefOr[Double] = js.native
  // a=mid
  var mid: js.UndefOr[String] = js.native
  // a=msid
  var msid: js.UndefOr[String] = js.native
  var payloads: js.UndefOr[String] = js.native
  var port: Double = js.native
  var protocol: String = js.native
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
  // a=setup
  var setup: js.UndefOr[String] = js.native
  var simulcast: js.UndefOr[AnonDir1] = js.native
  var simulcast_03: js.UndefOr[AnonValueString] = js.native
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AnonAddressTypes] = js.native
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[AnonSemantics]] = js.native
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[AnonAttribute]] = js.native
  var `type`: String = js.native
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.native
}

object typestringportnumberproto {
  @scala.inline
  def apply(
    fmtp: js.Array[AnonConfig],
    port: Double,
    protocol: String,
    rtp: js.Array[AnonCodec],
    `type`: String
  ): typestringportnumberproto = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typestringportnumberproto]
  }
  @scala.inline
  implicit class typestringportnumberprotoOps[Self <: typestringportnumberproto] (val x: Self) extends AnyVal {
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtp(value: js.Array[AnonCodec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBandwidth(value: js.Array[AnonLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
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
    def withConnection(value: AnonIp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: sendrecv | recvonly | sendonly | inactive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
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
    def withExt(value: js.Array[AnonUri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: AnonHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
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
    def withIcePwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icePwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcePwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icePwd")(js.undefined)
        ret
    }
    @scala.inline
    def withIceUfrag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceUfrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceUfrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceUfrag")(js.undefined)
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
    def withInvalid(value: js.Array[AnonValueString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
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
    def withPayloads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(js.undefined)
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
    def withSetup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
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
    def withSourceFilter(value: AnonAddressTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilter")(js.undefined)
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

