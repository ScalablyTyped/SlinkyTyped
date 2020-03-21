package typingsSlinky.std

import typingsSlinky.std.stdStrings.fulfilled
import typingsSlinky.std.stdStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.PromiseFulfilledResult[T]
  - typingsSlinky.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends js.Object

object PromiseSettledResult {
  @scala.inline
  def PromiseFulfilledResult[T](status: fulfilled, value: T): PromiseSettledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseSettledResult[T]]
  }
  @scala.inline
  def PromiseRejectedResult[T](reason: js.Any, status: rejected): PromiseSettledResult[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseSettledResult[T]]
  }
}

