package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.BindingPattern
*/
trait BindingName extends js.Object

object BindingName {
  @scala.inline
  implicit def apply(value: BindingPattern): BindingName = value.asInstanceOf[BindingName]
  @scala.inline
  implicit def apply(value: Identifier): BindingName = value.asInstanceOf[BindingName]
}

