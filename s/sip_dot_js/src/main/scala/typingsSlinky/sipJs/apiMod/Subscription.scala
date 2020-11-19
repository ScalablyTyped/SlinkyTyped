package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.subscriptionOptionsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "Subscription")
@js.native
abstract class Subscription protected ()
  extends typingsSlinky.sipJs.subscriptionMod.Subscription {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: SubscriptionOptions) = this()
}
