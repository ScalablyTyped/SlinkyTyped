package typingsSlinky.vueScrollto.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - java.lang.String
*/
trait ElementDescriptor extends js.Object

object ElementDescriptor {
  @scala.inline
  implicit def apply(value: Element): ElementDescriptor = value.asInstanceOf[ElementDescriptor]
  @scala.inline
  implicit def apply(value: String): ElementDescriptor = value.asInstanceOf[ElementDescriptor]
}

