package typingsSlinky.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api", "SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState with String] = js.native
  
  /* "Initial" */ val Initial: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Initial with String = js.native
  
  /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait with String = js.native
  
  /* "Subscribed" */ val Subscribed: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Subscribed with String = js.native
  
  /* "Terminated" */ val Terminated: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Terminated with String = js.native
}
