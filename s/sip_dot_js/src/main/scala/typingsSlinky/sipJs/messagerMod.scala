package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.messagerMessageOptionsMod.MessagerMessageOptions
import typingsSlinky.sipJs.messagerOptionsMod.MessagerOptions
import typingsSlinky.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagerMod {
  
  @JSImport("sip.js/lib/api/messager", "Messager")
  @js.native
  class Messager protected () extends StObject {
    /**
      * Constructs a new instance of the `Messager` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param content - Content for the body of the message.
      * @param contentType - Content type of the body of the message.
      * @param options - Options bucket. See {@link MessagerOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, content: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, content: String, contentType: String) = this()
    def this(
      userAgent: UserAgent,
      targetURI: URI,
      content: String,
      contentType: js.UndefOr[scala.Nothing],
      options: MessagerOptions
    ) = this()
    def this(
      userAgent: UserAgent,
      targetURI: URI,
      content: String,
      contentType: String,
      options: MessagerOptions
    ) = this()
    
    var logger: js.Any = js.native
    
    /**
      * Send the message.
      */
    def message(): js.Promise[Unit] = js.native
    def message(options: MessagerMessageOptions): js.Promise[Unit] = js.native
    
    var request: js.Any = js.native
    
    var userAgent: js.Any = js.native
  }
}
