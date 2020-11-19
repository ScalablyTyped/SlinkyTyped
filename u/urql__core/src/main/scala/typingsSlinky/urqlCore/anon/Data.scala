package typingsSlinky.urqlCore.anon

import typingsSlinky.urqlCore.urqlCoreStrings.cacheHit
import typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation
import typingsSlinky.urqlCore.urqlCoreStrings.fetchError
import typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest
import typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess
import typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] extends js.Object {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any = js.native
}
object Data {
  
  @scala.inline
  def apply[T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data[_], T /* <: cacheHit | cacheInvalidation | fetchRequest | fetchSuccess | fetchError | retryRetrying | String */] (val x: Self with Data[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @urql/core.@urql/core/dist/types/types.DebugEventTypes[T] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
