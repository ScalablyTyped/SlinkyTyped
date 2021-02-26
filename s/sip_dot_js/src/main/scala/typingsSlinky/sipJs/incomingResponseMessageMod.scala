package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingMessageMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingResponseMessageMod {
  
  @JSImport("sip.js/lib/core/messages/incoming-response-message", "IncomingResponseMessage")
  @js.native
  class IncomingResponseMessage () extends IncomingMessage {
    
    var reasonPhrase: js.UndefOr[String] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
}
