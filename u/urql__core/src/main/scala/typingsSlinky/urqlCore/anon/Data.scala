package typingsSlinky.urqlCore.anon

import typingsSlinky.urqlCore.urqlCoreStrings.cacheHit
import typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation
import typingsSlinky.urqlCore.urqlCoreStrings.fetchError
import typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest
import typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess
import typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] extends js.Object {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
}

object Data {
  @scala.inline
  def apply[T](
    data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

