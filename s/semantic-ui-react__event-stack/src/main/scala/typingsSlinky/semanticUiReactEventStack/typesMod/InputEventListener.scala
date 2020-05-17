package typingsSlinky.semanticUiReactEventStack.typesMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.EventListener
  - js.Array[typingsSlinky.std.EventListener]
*/
trait InputEventListener extends js.Object

object InputEventListener {
  @scala.inline
  implicit def apply(value: js.Array[EventListener]): InputEventListener = value.asInstanceOf[InputEventListener]
  @scala.inline
  implicit def apply(value: EventListener): InputEventListener = value.asInstanceOf[InputEventListener]
}

