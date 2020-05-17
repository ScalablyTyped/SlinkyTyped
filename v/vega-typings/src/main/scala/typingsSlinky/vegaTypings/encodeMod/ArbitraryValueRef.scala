package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.encodeMod.NumericValueRef
  - typingsSlinky.vegaTypings.encodeMod.ColorValueRef
  - typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[js.Any]
*/
trait ArbitraryValueRef extends js.Object

object ArbitraryValueRef {
  @scala.inline
  implicit def apply(value: ColorValueRef): ArbitraryValueRef = value.asInstanceOf[ArbitraryValueRef]
  @scala.inline
  implicit def apply(value: NumericValueRef): ArbitraryValueRef = value.asInstanceOf[ArbitraryValueRef]
  @scala.inline
  implicit def apply(value: ScaledValueRef[js.Any]): ArbitraryValueRef = value.asInstanceOf[ArbitraryValueRef]
}

