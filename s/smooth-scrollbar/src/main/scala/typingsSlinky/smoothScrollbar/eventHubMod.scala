package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/utils/event-hub", JSImport.Namespace)
@js.native
object eventHubMod extends js.Object {
  
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  
  type EventHandler = js.Function1[/* event */ js.Any, Unit]
}
