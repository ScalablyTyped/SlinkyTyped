package typingsSlinky.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useSubscriptionMod {
  
  type SubscriptionHandler[T, R] = js.Function2[/* prev */ js.UndefOr[R], /* data */ T, R]
  
  type UseSubscriptionResponse[T] = js.Tuple2[
    typingsSlinky.urql.useSubscriptionMod.UseSubscriptionState[T], 
    js.Function1[/* opts */ js.UndefOr[typingsSlinky.urql.anon.PartialOperationContext], scala.Unit]
  ]
}
