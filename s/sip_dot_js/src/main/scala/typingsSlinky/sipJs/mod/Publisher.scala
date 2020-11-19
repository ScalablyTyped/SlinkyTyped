package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.publisherOptionsMod.PublisherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Publisher")
@js.native
class Publisher protected ()
  extends typingsSlinky.sipJs.apiMod.Publisher {
  /**
    * Constructs a new instance of the `Publisher` class.
    *
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param eventType - The event type identifying the published document.
    * @param options - Options bucket. See {@link PublisherOptions} for details.
    */
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    targetURI: typingsSlinky.sipJs.coreMod.URI,
    eventType: String
  ) = this()
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    targetURI: typingsSlinky.sipJs.coreMod.URI,
    eventType: String,
    options: PublisherOptions
  ) = this()
}
