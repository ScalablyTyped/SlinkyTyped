package typingsSlinky.urqlCore.subscriptionMod

import typingsSlinky.urqlCore.anon.ExecutionResultkeystringa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionExchangeOpts extends js.Object {
  
  /** This flag may be turned on to allow your subscriptions-transport to handle all operation types */
  var enableAllOperations: js.UndefOr[Boolean] = js.native
  
  def forwardSubscription(operation: SubscriptionOperation): ObservableLike[ExecutionResultkeystringa] = js.native
  @JSName("forwardSubscription")
  var forwardSubscription_Original: SubscriptionForwarder = js.native
}
