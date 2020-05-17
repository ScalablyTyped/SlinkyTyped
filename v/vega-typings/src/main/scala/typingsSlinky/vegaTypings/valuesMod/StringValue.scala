package typingsSlinky.vegaTypings.valuesMod

import typingsSlinky.vegaTypings.encodeMod.StringValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.vegaTypings.encodeMod.StringValueRef
*/
trait StringValue extends js.Object

object StringValue {
  @scala.inline
  implicit def apply(value: String): StringValue = value.asInstanceOf[StringValue]
  @scala.inline
  implicit def apply(value: StringValueRef): StringValue = value.asInstanceOf[StringValue]
}

