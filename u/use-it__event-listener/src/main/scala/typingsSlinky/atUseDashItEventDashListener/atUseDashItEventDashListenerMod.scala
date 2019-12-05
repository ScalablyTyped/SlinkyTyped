package typingsSlinky.atUseDashItEventDashListener

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.reactMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Namespace)
@js.native
object atUseDashItEventDashListenerMod extends js.Object {
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  def default[T /* <: SyntheticEvent[Event, _] */](eventName: String, handler: EventHandler[T]): Unit = js.native
  def default[T /* <: SyntheticEvent[Event, _] */](eventName: String, handler: EventHandler[T], element: HTMLElement): Unit = js.native
}

