package typingsSlinky.smoothDashScrollbar

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typingsSlinky.smoothDashScrollbar.utilsEventDashHubMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/utils/event-hub", JSImport.Namespace)
@js.native
object utilsEventDashHubMod extends js.Object {
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  type EventHandler = js.Function1[/* event */ js.Any, Unit]
}

