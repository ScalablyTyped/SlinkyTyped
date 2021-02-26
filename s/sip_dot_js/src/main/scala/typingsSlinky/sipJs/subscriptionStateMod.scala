package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionStateMod {
  
  @js.native
  sealed trait SubscriptionState extends StObject
  @JSImport("sip.js/lib/api/subscription-state", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    
    @js.native
    sealed trait Initial extends SubscriptionState
    /* "Initial" */ val Initial: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Initial with String = js.native
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait with String = js.native
    
    @js.native
    sealed trait Subscribed extends SubscriptionState
    /* "Subscribed" */ val Subscribed: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Subscribed with String = js.native
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.subscriptionStateMod.SubscriptionState.Terminated with String = js.native
  }
}
