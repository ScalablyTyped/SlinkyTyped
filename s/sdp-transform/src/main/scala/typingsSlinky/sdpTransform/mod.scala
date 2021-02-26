package typingsSlinky.sdpTransform

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sdpTransform.anon.Address
import typingsSlinky.sdpTransform.anon.AddressTypes
import typingsSlinky.sdpTransform.anon.App
import typingsSlinky.sdpTransform.anon.Attribute
import typingsSlinky.sdpTransform.anon.Attrs1
import typingsSlinky.sdpTransform.anon.Codec
import typingsSlinky.sdpTransform.anon.Component
import typingsSlinky.sdpTransform.anon.Config
import typingsSlinky.sdpTransform.anon.Dir1
import typingsSlinky.sdpTransform.anon.Direction
import typingsSlinky.sdpTransform.anon.Foundation
import typingsSlinky.sdpTransform.anon.Hash
import typingsSlinky.sdpTransform.anon.Id
import typingsSlinky.sdpTransform.anon.Ip
import typingsSlinky.sdpTransform.anon.IpVer
import typingsSlinky.sdpTransform.anon.Limit
import typingsSlinky.sdpTransform.anon.Mids
import typingsSlinky.sdpTransform.anon.Paused
import typingsSlinky.sdpTransform.anon.Payload
import typingsSlinky.sdpTransform.anon.Semantic
import typingsSlinky.sdpTransform.anon.Semantics
import typingsSlinky.sdpTransform.anon.Start
import typingsSlinky.sdpTransform.anon.Uri
import typingsSlinky.sdpTransform.anon.Value
import typingsSlinky.sdpTransform.anon.ValueString
import typingsSlinky.sdpTransform.anon.typestringportnumberproto
import typingsSlinky.sdpTransform.sdpTransformStrings.inactive
import typingsSlinky.sdpTransform.sdpTransformStrings.recvonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendrecv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sdp-transform", "parse")
  @js.native
  def parse(description: String): SessionDescription = js.native
  
  @JSImport("sdp-transform", "parseImageAttributes")
  @js.native
  def parseImageAttributes(params: String): js.Array[ParamMap] = js.native
  
  @JSImport("sdp-transform", "parseParams")
  @js.native
  def parseParams(params: String): ParamMap = js.native
  
  @JSImport("sdp-transform", "parsePayloads")
  @js.native
  def parsePayloads(payloads: String): js.Array[Double] = js.native
  
  @JSImport("sdp-transform", "parseRemoteCandidates")
  @js.native
  def parseRemoteCandidates(candidates: String): js.Array[Component] = js.native
  
  @JSImport("sdp-transform", "parseSimulcastStreamList")
  @js.native
  def parseSimulcastStreamList(streams: String): js.Array[Paused] = js.native
  
  @JSImport("sdp-transform", "write")
  @js.native
  def write(description: SessionDescription): String = js.native
  
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
    implicit class MediaAttributesMutableBuilder[Self <: MediaAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[Foundation]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
      
      @scala.inline
      def setCandidatesVarargs(value: Foundation*): Self = StObject.set(x, "candidates", js.Array(value :_*))
      
      @scala.inline
      def setCrypto(value: Id): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
      
      @scala.inline
      def setEndOfCandidates(value: String): Self = StObject.set(x, "endOfCandidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndOfCandidatesUndefined: Self = StObject.set(x, "endOfCandidates", js.undefined)
      
      @scala.inline
      def setFmtp(value: js.Array[Config]): Self = StObject.set(x, "fmtp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFmtpVarargs(value: Config*): Self = StObject.set(x, "fmtp", js.Array(value :_*))
      
      @scala.inline
      def setFramerate(value: Double | String): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      @scala.inline
      def setImageattrs(value: js.Array[Attrs1]): Self = StObject.set(x, "imageattrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageattrsUndefined: Self = StObject.set(x, "imageattrs", js.undefined)
      
      @scala.inline
      def setImageattrsVarargs(value: Attrs1*): Self = StObject.set(x, "imageattrs", js.Array(value :_*))
      
      @scala.inline
      def setMaxptime(value: Double): Self = StObject.set(x, "maxptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxptimeUndefined: Self = StObject.set(x, "maxptime", js.undefined)
      
      @scala.inline
      def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
      
      @scala.inline
      def setMsid(value: String): Self = StObject.set(x, "msid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsidUndefined: Self = StObject.set(x, "msid", js.undefined)
      
      @scala.inline
      def setPtime(value: Double): Self = StObject.set(x, "ptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtimeUndefined: Self = StObject.set(x, "ptime", js.undefined)
      
      @scala.inline
      def setRemoteCandidates(value: String): Self = StObject.set(x, "remoteCandidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteCandidatesUndefined: Self = StObject.set(x, "remoteCandidates", js.undefined)
      
      @scala.inline
      def setRids(value: js.Array[Direction]): Self = StObject.set(x, "rids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRidsUndefined: Self = StObject.set(x, "rids", js.undefined)
      
      @scala.inline
      def setRidsVarargs(value: Direction*): Self = StObject.set(x, "rids", js.Array(value :_*))
      
      @scala.inline
      def setRtcp(value: IpVer): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtcpFb(value: js.Array[Payload]): Self = StObject.set(x, "rtcpFb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtcpFbTrrInt(value: js.Array[Value]): Self = StObject.set(x, "rtcpFbTrrInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtcpFbTrrIntUndefined: Self = StObject.set(x, "rtcpFbTrrInt", js.undefined)
      
      @scala.inline
      def setRtcpFbTrrIntVarargs(value: Value*): Self = StObject.set(x, "rtcpFbTrrInt", js.Array(value :_*))
      
      @scala.inline
      def setRtcpFbUndefined: Self = StObject.set(x, "rtcpFb", js.undefined)
      
      @scala.inline
      def setRtcpFbVarargs(value: Payload*): Self = StObject.set(x, "rtcpFb", js.Array(value :_*))
      
      @scala.inline
      def setRtcpMux(value: String): Self = StObject.set(x, "rtcpMux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtcpMuxUndefined: Self = StObject.set(x, "rtcpMux", js.undefined)
      
      @scala.inline
      def setRtcpRsize(value: String): Self = StObject.set(x, "rtcpRsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtcpRsizeUndefined: Self = StObject.set(x, "rtcpRsize", js.undefined)
      
      @scala.inline
      def setRtcpUndefined: Self = StObject.set(x, "rtcp", js.undefined)
      
      @scala.inline
      def setRtp(value: js.Array[Codec]): Self = StObject.set(x, "rtp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtpVarargs(value: Codec*): Self = StObject.set(x, "rtp", js.Array(value :_*))
      
      @scala.inline
      def setSctpmap(value: App): Self = StObject.set(x, "sctpmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSctpmapUndefined: Self = StObject.set(x, "sctpmap", js.undefined)
      
      @scala.inline
      def setSimulcast(value: Dir1): Self = StObject.set(x, "simulcast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulcastUndefined: Self = StObject.set(x, "simulcast", js.undefined)
      
      @scala.inline
      def setSimulcast_03(value: ValueString): Self = StObject.set(x, "simulcast_03", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulcast_03Undefined: Self = StObject.set(x, "simulcast_03", js.undefined)
      
      @scala.inline
      def setSsrcGroups(value: js.Array[Semantics]): Self = StObject.set(x, "ssrcGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrcGroupsUndefined: Self = StObject.set(x, "ssrcGroups", js.undefined)
      
      @scala.inline
      def setSsrcGroupsVarargs(value: Semantics*): Self = StObject.set(x, "ssrcGroups", js.Array(value :_*))
      
      @scala.inline
      def setSsrcs(value: js.Array[Attribute]): Self = StObject.set(x, "ssrcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrcsUndefined: Self = StObject.set(x, "ssrcs", js.undefined)
      
      @scala.inline
      def setSsrcsVarargs(value: Attribute*): Self = StObject.set(x, "ssrcs", js.Array(value :_*))
      
      @scala.inline
      def setXGoogleFlag(value: String): Self = StObject.set(x, "xGoogleFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXGoogleFlagUndefined: Self = StObject.set(x, "xGoogleFlag", js.undefined)
    }
  }
  
  @js.native
  trait MediaDescription
    extends MediaAttributes
       with SharedDescriptionFields
  object MediaDescription {
    
    @scala.inline
    def apply(fmtp: js.Array[Config], rtp: js.Array[Codec]): MediaDescription = {
      val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaDescription]
    }
  }
  
  type ParamMap = StringDictionary[Double | String]
  
  @js.native
  trait SessionAttributes extends SharedAttributes {
    
    // a=group:BUNDLE audio video
    var groups: js.UndefOr[js.Array[Mids]] = js.native
    
    // a=ice-options:google-ice
    var iceOptions: js.UndefOr[String] = js.native
    
    var icelite: js.UndefOr[String] = js.native
    
    // a=msid-semantic: WMS Jvlam5X3SX1OP6pn20zWogvaKJz5Hjf9OnlV
    var msidSemantic: js.UndefOr[Semantic] = js.native
  }
  object SessionAttributes {
    
    @scala.inline
    def apply(): SessionAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionAttributes]
    }
    
    @scala.inline
    implicit class SessionAttributesMutableBuilder[Self <: SessionAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[Mids]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: Mids*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setIceOptions(value: String): Self = StObject.set(x, "iceOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceOptionsUndefined: Self = StObject.set(x, "iceOptions", js.undefined)
      
      @scala.inline
      def setIcelite(value: String): Self = StObject.set(x, "icelite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceliteUndefined: Self = StObject.set(x, "icelite", js.undefined)
      
      @scala.inline
      def setMsidSemantic(value: Semantic): Self = StObject.set(x, "msidSemantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsidSemanticUndefined: Self = StObject.set(x, "msidSemantic", js.undefined)
    }
  }
  
  @js.native
  trait SessionDescription
    extends SessionAttributes
       with SharedDescriptionFields {
    
    // e=
    var email: js.UndefOr[String] = js.native
    
    // m=
    var media: js.Array[typestringportnumberproto] = js.native
    
    // s=
    var name: js.UndefOr[String] = js.native
    
    // o=
    var origin: js.UndefOr[Address] = js.native
    
    // p=
    var phone: js.UndefOr[String] = js.native
    
    // r=
    var repeats: js.UndefOr[String] = js.native
    
    // z=
    var timezones: js.UndefOr[String] = js.native
    
    // t=0 0
    var timing: js.UndefOr[Start] = js.native
    
    // u=
    var uri: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object SessionDescription {
    
    @scala.inline
    def apply(media: js.Array[typestringportnumberproto]): SessionDescription = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionDescription]
    }
    
    @scala.inline
    implicit class SessionDescriptionMutableBuilder[Self <: SessionDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setMedia(value: js.Array[typestringportnumberproto]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaVarargs(value: typestringportnumberproto*): Self = StObject.set(x, "media", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrigin(value: Address): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setRepeats(value: String): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
      
      @scala.inline
      def setTimezones(value: String): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezonesUndefined: Self = StObject.set(x, "timezones", js.undefined)
      
      @scala.inline
      def setTiming(value: Start): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait SharedAttributes extends StObject {
    
    // a=control
    var control: js.UndefOr[String] = js.native
    
    // a=sendrecv
    // a=recvonly
    // a=sendonly
    // a=inactive
    var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.native
    
    // a=extmap
    var ext: js.UndefOr[js.Array[Uri]] = js.native
    
    var fingerprint: js.UndefOr[Hash] = js.native
    
    var icePwd: js.UndefOr[String] = js.native
    
    var iceUfrag: js.UndefOr[String] = js.native
    
    var invalid: js.UndefOr[js.Array[ValueString]] = js.native
    
    // a=setup
    var setup: js.UndefOr[String] = js.native
    
    // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
    var sourceFilter: js.UndefOr[AddressTypes] = js.native
  }
  object SharedAttributes {
    
    @scala.inline
    def apply(): SharedAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedAttributes]
    }
    
    @scala.inline
    implicit class SharedAttributesMutableBuilder[Self <: SharedAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setDirection(value: sendrecv | recvonly | sendonly | inactive): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setExt(value: js.Array[Uri]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setExtVarargs(value: Uri*): Self = StObject.set(x, "ext", js.Array(value :_*))
      
      @scala.inline
      def setFingerprint(value: Hash): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setIcePwd(value: String): Self = StObject.set(x, "icePwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcePwdUndefined: Self = StObject.set(x, "icePwd", js.undefined)
      
      @scala.inline
      def setIceUfrag(value: String): Self = StObject.set(x, "iceUfrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceUfragUndefined: Self = StObject.set(x, "iceUfrag", js.undefined)
      
      @scala.inline
      def setInvalid(value: js.Array[ValueString]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setInvalidVarargs(value: ValueString*): Self = StObject.set(x, "invalid", js.Array(value :_*))
      
      @scala.inline
      def setSetup(value: String): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setSourceFilter(value: AddressTypes): Self = StObject.set(x, "sourceFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFilterUndefined: Self = StObject.set(x, "sourceFilter", js.undefined)
    }
  }
  
  @js.native
  trait SharedDescriptionFields extends StObject {
    
    // b=AS:4000
    var bandwidth: js.UndefOr[js.Array[Limit]] = js.native
    
    // c=IN IP4 10.47.197.26
    var connection: js.UndefOr[Ip] = js.native
    
    // i=
    var description: js.UndefOr[String] = js.native
  }
  object SharedDescriptionFields {
    
    @scala.inline
    def apply(): SharedDescriptionFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedDescriptionFields]
    }
    
    @scala.inline
    implicit class SharedDescriptionFieldsMutableBuilder[Self <: SharedDescriptionFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBandwidth(value: js.Array[Limit]): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
      
      @scala.inline
      def setBandwidthVarargs(value: Limit*): Self = StObject.set(x, "bandwidth", js.Array(value :_*))
      
      @scala.inline
      def setConnection(value: Ip): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
}
