package typingsSlinky.std

import typingsSlinky.std.stdStrings.fulfilled
import typingsSlinky.std.stdStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.PromiseFulfilledResult[T]
  - typingsSlinky.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends StObject
object PromiseSettledResult {
  
  @scala.inline
  def PromiseFulfilledResult[T](status: fulfilled, value: T): typingsSlinky.std.PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.std.PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  def PromiseRejectedResult(reason: js.Any, status: rejected): typingsSlinky.std.PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.std.PromiseRejectedResult]
  }
}
