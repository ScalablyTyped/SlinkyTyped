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

@js.native
trait FnCallT extends js.Object {
  def apply(
    t: DebugEventArg[
      String | cacheHit | cacheInvalidation | fetchError | fetchRequest | fetchSuccess | retryRetrying
    ]
  ): Unit = js.native
}

