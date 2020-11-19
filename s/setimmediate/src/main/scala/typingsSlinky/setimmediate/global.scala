package typingsSlinky.setimmediate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Aborts the specified macrotask before it's run.
    *
    * @param handle The ID of the macrotask to remove from the macrotask queue.
    */
  def clearImmediate(handle: Double): Unit = js.native
  
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Double = js.native
}
