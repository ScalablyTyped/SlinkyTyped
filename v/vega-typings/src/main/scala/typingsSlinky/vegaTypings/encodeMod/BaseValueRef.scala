package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.anon.Value[T]
  - typingsSlinky.vegaTypings.anon.Field
*/
trait BaseValueRef[T] extends ScaledValueRef[T]

object BaseValueRef {
  @scala.inline
  def SignalRef[T](signal: String): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseValueRef[T]]
  }
  @scala.inline
  def Value[T](): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseValueRef[T]]
  }
  @scala.inline
  def Field[T](field: typingsSlinky.vegaTypings.encodeMod.Field): BaseValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseValueRef[T]]
  }
}

