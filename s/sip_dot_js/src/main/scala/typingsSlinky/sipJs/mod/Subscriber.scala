package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.subscriberOptionsMod.SubscriberOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Subscriber")
@js.native
class Subscriber protected ()
  extends typingsSlinky.sipJs.apiMod.Subscriber {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - The request URI identifying the subscribed event.
    * @param eventType - The event type identifying the subscribed event.
    * @param options - Options bucket. See {@link SubscriberOptions} for details.
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
    options: SubscriberOptions
  ) = this()
}
