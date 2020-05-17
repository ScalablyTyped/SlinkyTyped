package typingsSlinky.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.vegaTypings.transformMod.TransformField
*/
trait FieldRef extends js.Object

object FieldRef {
  @scala.inline
  implicit def apply(value: String): FieldRef = value.asInstanceOf[FieldRef]
  @scala.inline
  implicit def apply(value: TransformField): FieldRef = value.asInstanceOf[FieldRef]
}

