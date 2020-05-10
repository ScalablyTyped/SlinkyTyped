package typingsSlinky.uifabricUtilities

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/on", JSImport.Namespace)
@js.native
object onMod extends js.Object {
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def on(element: Window_, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Window_,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
}

