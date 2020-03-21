package typingsSlinky.useItEventListener

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.EventHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  def default[T /* <: SyntheticEvent[Event_, _] */](eventName: String, handler: EventHandler[T]): Unit = js.native
  def default[T /* <: SyntheticEvent[Event_, _] */](eventName: String, handler: EventHandler[T], element: HTMLElement): Unit = js.native
}

