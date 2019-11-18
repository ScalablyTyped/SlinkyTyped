package typingsSlinky.atSemanticDashUiDashReactEventDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  import typingsSlinky.atSemanticDashUiDashReactEventDashStack.Anon_Called
  import typingsSlinky.react.reactMod.RefObject
  import typingsSlinky.std.Document
  import typingsSlinky.std.EventListener
  import typingsSlinky.std.HTMLElement
  import typingsSlinky.std.Map
  import typingsSlinky.std.Window

  type CallableEventListener = EventListener with Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = Map[String, T]
  type InputEventListener = EventListener | js.Array[EventListener]
  type InputTargetElement = Boolean | String | TargetElement | RefObject[TargetElement]
  type TargetElement = Document | HTMLElement | Window
}
