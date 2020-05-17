package typingsSlinky.uifabricFoundation.libIslotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TShorthandProp
  - TProps
*/
trait ISlotProp[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object

object ISlotProp {
  @scala.inline
  implicit def apply[TProps, TShorthandProp](value: TProps | TShorthandProp): ISlotProp[TProps, TShorthandProp] = value.asInstanceOf[ISlotProp[TProps, TShorthandProp]]
}

