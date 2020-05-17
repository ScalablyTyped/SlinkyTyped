package typingsSlinky.testingLibraryUserEvent.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - typingsSlinky.std.Window
*/
trait TargetElement extends js.Object

object TargetElement {
  @scala.inline
  implicit def apply(value: Element): TargetElement = value.asInstanceOf[TargetElement]
  @scala.inline
  implicit def apply(value: Window): TargetElement = value.asInstanceOf[TargetElement]
}

