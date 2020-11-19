package typingsSlinky.std

import typingsSlinky.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.IteratorYieldResult[T]
  - typingsSlinky.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends js.Object
object IteratorResult {
  
  @scala.inline
  def IteratorYieldResult[T, TReturn](value: T): IteratorResult[T, TReturn] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T, TReturn]]
  }
  
  @scala.inline
  def IteratorReturnResult[T, TReturn](done: `true`, value: TReturn): IteratorResult[T, TReturn] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T, TReturn]]
  }
}
