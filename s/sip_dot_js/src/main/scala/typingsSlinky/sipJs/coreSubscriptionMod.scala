package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSubscriptionMod {
  
  @JSImport("sip.js/lib/core/subscription", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState with String] = js.native
    
    /* "Active" */ val Active: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
    
    /* "Initial" */ val Initial: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
    
    /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
    
    /* "Pending" */ val Pending: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
    
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
  }
}
