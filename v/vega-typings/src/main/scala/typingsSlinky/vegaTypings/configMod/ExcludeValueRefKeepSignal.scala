package typingsSlinky.vegaTypings.configMod

import typingsSlinky.std.Exclude
import typingsSlinky.vegaTypings.encodeMod.ColorValueRef
import typingsSlinky.vegaTypings.encodeMod.NumericValueRef
import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Exclude[
T, 
typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[js.Any] | typingsSlinky.vegaTypings.encodeMod.NumericValueRef | typingsSlinky.vegaTypings.encodeMod.ColorValueRef]
  - typingsSlinky.vegaTypings.configMod.KeepSignal[T]
*/
trait ExcludeValueRefKeepSignal[T] extends js.Object

object ExcludeValueRefKeepSignal {
  @scala.inline
  implicit def apply[T](value: Exclude[T, ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]): ExcludeValueRefKeepSignal[T] = value.asInstanceOf[ExcludeValueRefKeepSignal[T]]
  @scala.inline
  implicit def apply[T](value: KeepSignal[T]): ExcludeValueRefKeepSignal[T] = value.asInstanceOf[ExcludeValueRefKeepSignal[T]]
}

