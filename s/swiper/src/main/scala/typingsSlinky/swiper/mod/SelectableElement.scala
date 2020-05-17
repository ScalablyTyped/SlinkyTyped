package typingsSlinky.swiper.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
*/
trait SelectableElement extends js.Object

object SelectableElement {
  @scala.inline
  implicit def apply(value: HTMLElement): SelectableElement = value.asInstanceOf[SelectableElement]
  @scala.inline
  implicit def apply(value: String): SelectableElement = value.asInstanceOf[SelectableElement]
}

