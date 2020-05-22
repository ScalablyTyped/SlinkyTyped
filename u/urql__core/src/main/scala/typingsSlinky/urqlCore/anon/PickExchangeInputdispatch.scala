package typingsSlinky.urqlCore.anon

import typingsSlinky.urqlCore.typesMod.DebugEventArg
import typingsSlinky.urqlCore.urqlCoreStrings.cacheHit
import typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation
import typingsSlinky.urqlCore.urqlCoreStrings.fetchError
import typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest
import typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess
import typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@urql/core.@urql/core/dist/types/types.ExchangeInput, 'dispatchDebug'> */
@js.native
trait PickExchangeInputdispatch extends js.Object {
  @JSName("dispatchDebug")
  var dispatchDebug_Original: js.Function1[
    /* t */ DebugEventArg[
      cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String
    ], 
    Unit
  ] = js.native
  def dispatchDebug[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */](t: DebugEventArg[T]): Unit = js.native
}

