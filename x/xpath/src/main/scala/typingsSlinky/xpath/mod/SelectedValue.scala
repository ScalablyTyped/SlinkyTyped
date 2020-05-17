package typingsSlinky.xpath.mod

import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Node
  - typingsSlinky.std.Attr
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait SelectedValue extends js.Object

object SelectedValue {
  @scala.inline
  implicit def apply(value: Attr): SelectedValue = value.asInstanceOf[SelectedValue]
  @scala.inline
  implicit def apply(value: Boolean): SelectedValue = value.asInstanceOf[SelectedValue]
  @scala.inline
  implicit def apply(value: Double): SelectedValue = value.asInstanceOf[SelectedValue]
  @scala.inline
  implicit def apply(value: Node): SelectedValue = value.asInstanceOf[SelectedValue]
  @scala.inline
  implicit def apply(value: String): SelectedValue = value.asInstanceOf[SelectedValue]
}

