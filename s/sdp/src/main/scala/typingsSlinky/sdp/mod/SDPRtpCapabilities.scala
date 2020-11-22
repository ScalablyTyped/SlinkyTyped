package typingsSlinky.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPRtpCapabilities extends js.Object {
  
  var codecs: js.Array[SDPCodec] = js.native
  
  var fecMechanisms: js.Array[String] = js.native
  
  var headerExtensions: js.Array[SDPHeaderExtension] = js.native
  
  var rtcp: js.UndefOr[js.Array[SDPRtcpParameters]] = js.native
}
object SDPRtpCapabilities {
  
  @scala.inline
  def apply(
    codecs: js.Array[SDPCodec],
    fecMechanisms: js.Array[String],
    headerExtensions: js.Array[SDPHeaderExtension]
  ): SDPRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], fecMechanisms = fecMechanisms.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPRtpCapabilities]
  }
  
  @scala.inline
  implicit class SDPRtpCapabilitiesOps[Self <: SDPRtpCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodecsVarargs(value: SDPCodec*): Self = this.set("codecs", js.Array(value :_*))
    
    @scala.inline
    def setCodecs(value: js.Array[SDPCodec]): Self = this.set("codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFecMechanismsVarargs(value: String*): Self = this.set("fecMechanisms", js.Array(value :_*))
    
    @scala.inline
    def setFecMechanisms(value: js.Array[String]): Self = this.set("fecMechanisms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtensionsVarargs(value: SDPHeaderExtension*): Self = this.set("headerExtensions", js.Array(value :_*))
    
    @scala.inline
    def setHeaderExtensions(value: js.Array[SDPHeaderExtension]): Self = this.set("headerExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpVarargs(value: SDPRtcpParameters*): Self = this.set("rtcp", js.Array(value :_*))
    
    @scala.inline
    def setRtcp(value: js.Array[SDPRtcpParameters]): Self = this.set("rtcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcp: Self = this.set("rtcp", js.undefined)
  }
}
