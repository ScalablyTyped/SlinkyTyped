package typingsSlinky.semanticUiReactEventStack.typesMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Document
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.Window
*/
trait TargetElement extends InputTargetElement

object TargetElement {
  @scala.inline
  implicit def apply(value: Document): TargetElement = value.asInstanceOf[TargetElement]
  @scala.inline
  implicit def apply(value: HTMLElement): TargetElement = value.asInstanceOf[TargetElement]
  @scala.inline
  implicit def apply(value: Window): TargetElement = value.asInstanceOf[TargetElement]
}

