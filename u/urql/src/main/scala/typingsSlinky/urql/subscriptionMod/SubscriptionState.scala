package typingsSlinky.urql.subscriptionMod

import typingsSlinky.urql.anon.PartialOperationContext
import typingsSlinky.urql.useSubscriptionMod.UseSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionState[T] extends UseSubscriptionState[T] {
  
  def executeSubscription(): Unit = js.native
  def executeSubscription(opts: PartialOperationContext): Unit = js.native
}
