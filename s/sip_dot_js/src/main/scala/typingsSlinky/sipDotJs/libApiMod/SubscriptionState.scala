package typingsSlinky.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  /* "Initial" */ val Initial: typingsSlinky.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Initial with String = js.native
  /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.NotifyWait with String = js.native
  /* "Subscribed" */ val Subscribed: typingsSlinky.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Subscribed with String = js.native
  /* "Terminated" */ val Terminated: typingsSlinky.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsSlinky.sipDotJs.libApiSubscriptionDashStateMod.SubscriptionState with String
  ] = js.native
}

