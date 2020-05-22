package typingsSlinky.semanticUiReactEventStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CallableEventListener = typingsSlinky.std.EventListener with typingsSlinky.semanticUiReactEventStack.anon.Called
  type EventListeners = js.Array[typingsSlinky.semanticUiReactEventStack.typesMod.CallableEventListener]
  type GenericMap[T] = typingsSlinky.std.Map[java.lang.String, T]
  type InputEventListener = typingsSlinky.std.EventListener | js.Array[typingsSlinky.std.EventListener]
  type InputTargetElement = scala.Boolean | java.lang.String | typingsSlinky.semanticUiReactEventStack.typesMod.TargetElement | slinky.core.facade.ReactRef[typingsSlinky.semanticUiReactEventStack.typesMod.TargetElement]
  type TargetElement = org.scalajs.dom.raw.Document | org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.Window
}
