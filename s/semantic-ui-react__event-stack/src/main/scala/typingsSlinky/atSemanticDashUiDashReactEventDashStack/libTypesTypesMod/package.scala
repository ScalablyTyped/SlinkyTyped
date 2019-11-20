package typingsSlinky.atSemanticDashUiDashReactEventDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  import org.scalajs.dom.raw.Document
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.Window
  import slinky.core.facade.ReactRef
  import typingsSlinky.atSemanticDashUiDashReactEventDashStack.Anon_Called
  import typingsSlinky.std.EventListener
  import typingsSlinky.std.Map

  type CallableEventListener = EventListener with Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = Map[String, T]
  type InputEventListener = EventListener | js.Array[EventListener]
  type InputTargetElement = Boolean | String | TargetElement | ReactRef[TargetElement]
  type TargetElement = Document | HTMLElement | Window
}
