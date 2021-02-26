package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpHeaderExtensionCapability extends StObject {
  
  var uri: js.UndefOr[java.lang.String] = js.native
}
object RTCRtpHeaderExtensionCapability {
  
  @scala.inline
  def apply(): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
  
  @scala.inline
  implicit class RTCRtpHeaderExtensionCapabilityMutableBuilder[Self <: RTCRtpHeaderExtensionCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
