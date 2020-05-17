package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Value
import typingsSlinky.vegaTypings.signalMod.SignalRef
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
  implicit def apply[T](value: typingsSlinky.vegaTypings.anon.Field): BaseValueRef[T] = value.asInstanceOf[BaseValueRef[T]]
  @scala.inline
  implicit def apply[T](value: SignalRef): BaseValueRef[T] = value.asInstanceOf[BaseValueRef[T]]
  @scala.inline
  implicit def apply[T](value: Value[T]): BaseValueRef[T] = value.asInstanceOf[BaseValueRef[T]]
}

