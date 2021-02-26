package typingsSlinky.sdp.mod

import typingsSlinky.sdp.anon.Mechanism
import typingsSlinky.sdp.anon.Ssrc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPEncodingParameters extends StObject {
  
  var codecPayloadType: js.UndefOr[Double] = js.native
  
  var fec: js.UndefOr[Mechanism] = js.native
  
  var rtx: js.UndefOr[Ssrc] = js.native
  
  var ssrc: Double = js.native
}
object SDPEncodingParameters {
  
  @scala.inline
  def apply(ssrc: Double): SDPEncodingParameters = {
    val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPEncodingParameters]
  }
  
  @scala.inline
  implicit class SDPEncodingParametersMutableBuilder[Self <: SDPEncodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecPayloadType(value: Double): Self = StObject.set(x, "codecPayloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecPayloadTypeUndefined: Self = StObject.set(x, "codecPayloadType", js.undefined)
    
    @scala.inline
    def setFec(value: Mechanism): Self = StObject.set(x, "fec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFecUndefined: Self = StObject.set(x, "fec", js.undefined)
    
    @scala.inline
    def setRtx(value: Ssrc): Self = StObject.set(x, "rtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtxUndefined: Self = StObject.set(x, "rtx", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
  }
}
