package typingsSlinky.semanticUiReactEventStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CallableEventListener = typingsSlinky.std.EventListener with typingsSlinky.semanticUiReactEventStack.anon.Called
  type EventListeners = js.Array[typingsSlinky.semanticUiReactEventStack.typesMod.CallableEventListener]
  type GenericMap[T] = typingsSlinky.std.Map[java.lang.String, T]
}
