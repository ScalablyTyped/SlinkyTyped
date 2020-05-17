package typingsSlinky.uikit.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.std.HTMLElement
  - java.lang.String
*/
trait UIkitElement extends js.Object

object UIkitElement {
  @scala.inline
  implicit def apply(value: HTMLElement): UIkitElement = value.asInstanceOf[UIkitElement]
  @scala.inline
  implicit def apply(value: js.Object): UIkitElement = value.asInstanceOf[UIkitElement]
  @scala.inline
  implicit def apply(value: String): UIkitElement = value.asInstanceOf[UIkitElement]
}

