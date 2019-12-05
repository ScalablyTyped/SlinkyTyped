package typingsSlinky.viewabilityDashHelper.viewabilityDashHelperMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewability-helper", "ViewabilityHelper")
@js.native
class ViewabilityHelper protected () extends js.Object {
  def this(element: Element, callback: js.Function0[Unit]) = this()
  def this(element: HTMLElement, callback: js.Function0[Unit]) = this()
  def this(element: Element, callback: js.Function0[Unit], options: Options) = this()
  def this(element: HTMLElement, callback: js.Function0[Unit], options: Options) = this()
  def observe(): Unit = js.native
}

