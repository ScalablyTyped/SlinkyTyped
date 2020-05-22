package typingsSlinky.uifabricReactHooks

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/react-hooks/lib/useOnEvent", JSImport.Namespace)
@js.native
object useOnEventMod extends js.Object {
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[Null | (ReactRef[js.UndefOr[TElement | Null]]) | TElement | Window],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[Null | (ReactRef[js.UndefOr[TElement | Null]]) | TElement | Window],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

