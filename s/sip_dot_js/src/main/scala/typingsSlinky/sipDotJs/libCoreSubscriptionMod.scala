package typingsSlinky.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/subscription", JSImport.Namespace)
@js.native
object libCoreSubscriptionMod extends js.Object {
  @js.native
  object SubscriptionState extends js.Object {
    /* "Active" */ val Active: typingsSlinky.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
    /* "Initial" */ val Initial: typingsSlinky.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
    /* "NotifyWait" */ val NotifyWait: typingsSlinky.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
    /* "Pending" */ val Pending: typingsSlinky.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
    /* "Terminated" */ val Terminated: typingsSlinky.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState with String
      ] = js.native
  }
  
}

