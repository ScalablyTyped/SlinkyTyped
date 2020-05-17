package typingsSlinky.vegaTypings.runtimeMod

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.MouseEvent
  - typingsSlinky.std.TouchEvent
  - typingsSlinky.std.KeyboardEvent
*/
trait ScenegraphEvent extends js.Object

object ScenegraphEvent {
  @scala.inline
  implicit def apply(value: KeyboardEvent): ScenegraphEvent = value.asInstanceOf[ScenegraphEvent]
  @scala.inline
  implicit def apply(value: MouseEvent): ScenegraphEvent = value.asInstanceOf[ScenegraphEvent]
  @scala.inline
  implicit def apply(value: TouchEvent): ScenegraphEvent = value.asInstanceOf[ScenegraphEvent]
}

