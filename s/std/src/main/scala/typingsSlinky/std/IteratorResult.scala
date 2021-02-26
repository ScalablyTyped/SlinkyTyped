package typingsSlinky.std

import typingsSlinky.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.IteratorYieldResult[T]
  - typingsSlinky.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  @scala.inline
  def IteratorReturnResult[TReturn](done: `true`, value: TReturn): typingsSlinky.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.std.IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  def IteratorYieldResult[T](value: T): typingsSlinky.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.std.IteratorYieldResult[T]]
  }
}
