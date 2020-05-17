package typingsSlinky.uifabricUtilities

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/on", JSImport.Namespace)
@js.native
object onMod extends js.Object {
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
}

