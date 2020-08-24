package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.subscriptionOptionsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Subscription")
@js.native
abstract class Subscription protected ()
  extends typingsSlinky.sipJs.apiMod.Subscription {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: SubscriptionOptions) = this()
}

