package typingsSlinky.tinycolor2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tinycolor2.mod.ColorInputWithoutInstance
  - typingsSlinky.tinycolor2.mod.Instance
*/
trait ColorInput extends js.Object

object ColorInput {
  @scala.inline
  implicit def apply(value: ColorInputWithoutInstance): ColorInput = value.asInstanceOf[ColorInput]
  @scala.inline
  implicit def apply(value: Instance): ColorInput = value.asInstanceOf[ColorInput]
}

