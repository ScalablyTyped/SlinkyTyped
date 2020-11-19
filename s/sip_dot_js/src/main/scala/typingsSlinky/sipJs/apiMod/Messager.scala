package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.messagerOptionsMod.MessagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "Messager")
@js.native
class Messager protected ()
  extends typingsSlinky.sipJs.messagerMod.Messager {
  /**
    * Constructs a new instance of the `Messager` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param content - Content for the body of the message.
    * @param contentType - Content type of the body of the message.
    * @param options - Options bucket. See {@link MessagerOptions} for details.
    */
  def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: URI, content: String) = this()
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: String
  ) = this()
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: js.UndefOr[scala.Nothing],
    options: MessagerOptions
  ) = this()
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    targetURI: URI,
    content: String,
    contentType: String,
    options: MessagerOptions
  ) = this()
}
