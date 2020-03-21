package typingsSlinky.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  /* "Active" */ val Active: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
  /* "Initial" */ val Initial: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
  /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
  /* "Pending" */ val Pending: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
  /* "Terminated" */ val Terminated: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState with String] = js.native
}

