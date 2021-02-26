package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingMessageMod.IncomingMessage
import typingsSlinky.sipJs.messagesMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingRequestMessageMod {
  
  @JSImport("sip.js/lib/core/messages/incoming-request-message", "IncomingRequestMessage")
  @js.native
  class IncomingRequestMessage () extends IncomingMessage {
    
    var ruri: js.UndefOr[URI] = js.native
  }
}
