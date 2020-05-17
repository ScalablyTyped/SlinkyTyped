package typingsSlinky.vegaTypings.valuesMod

import typingsSlinky.vegaTypings.encodeMod.BooleanValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.vegaTypings.encodeMod.BooleanValueRef
*/
trait BooleanValue extends js.Object

object BooleanValue {
  @scala.inline
  implicit def apply(value: Boolean): BooleanValue = value.asInstanceOf[BooleanValue]
  @scala.inline
  implicit def apply(value: BooleanValueRef): BooleanValue = value.asInstanceOf[BooleanValue]
}

