package typingsSlinky.sipDotJs.libApiMod

import typingsSlinky.sipDotJs.libApiPublisherDashOptionsMod.PublisherOptions
import typingsSlinky.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Publisher")
@js.native
class Publisher protected ()
  extends typingsSlinky.sipDotJs.libApiPublisherMod.Publisher {
  /**
    * Constructs a new instance of the `Publisher` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param eventType - The event type identifying the published document.
    * @param options - Options bucket. See {@link PublisherOptions} for details.
    */
  def this(
    userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    eventType: String
  ) = this()
  def this(
    userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    eventType: String,
    options: PublisherOptions
  ) = this()
}

