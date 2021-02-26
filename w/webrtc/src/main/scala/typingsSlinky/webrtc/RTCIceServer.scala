package typingsSlinky.webrtc

import typingsSlinky.std.RTCIceCredentialType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
@js.native
trait RTCIceServer extends StObject {
  
  //urls: string | string[];
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
}
object RTCIceServer {
  
  @scala.inline
  def apply(): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceServer]
  }
  
  @scala.inline
  implicit class RTCIceServerMutableBuilder[Self <: RTCIceServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialType(value: RTCIceCredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
  }
}
