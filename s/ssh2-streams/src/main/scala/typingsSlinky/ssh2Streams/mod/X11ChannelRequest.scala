package typingsSlinky.ssh2Streams.mod

import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`x11-req`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X11ChannelRequest extends ChannelRequest {
  
  var cookie: String = js.native
  
  var protocol: String = js.native
  
  var recipient: Double = js.native
  
  var request: `x11-req` = js.native
  
  var screen: Double = js.native
  
  var single: Boolean = js.native
  
  var wantReply: Boolean = js.native
}
object X11ChannelRequest {
  
  @scala.inline
  def apply(
    cookie: String,
    protocol: String,
    recipient: Double,
    request: `x11-req`,
    screen: Double,
    single: Boolean,
    wantReply: Boolean
  ): X11ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ChannelRequest]
  }
  
  @scala.inline
  implicit class X11ChannelRequestMutableBuilder[Self <: X11ChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `x11-req`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
