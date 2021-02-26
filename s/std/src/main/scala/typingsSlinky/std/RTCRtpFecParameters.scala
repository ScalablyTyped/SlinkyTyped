package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpFecParameters extends StObject {
  
  var mechanism: js.UndefOr[java.lang.String] = js.native
  
  var ssrc: js.UndefOr[Double] = js.native
}
object RTCRtpFecParameters {
  
  @scala.inline
  def apply(): RTCRtpFecParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpFecParameters]
  }
  
  @scala.inline
  implicit class RTCRtpFecParametersMutableBuilder[Self <: RTCRtpFecParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMechanism(value: java.lang.String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
  }
}
