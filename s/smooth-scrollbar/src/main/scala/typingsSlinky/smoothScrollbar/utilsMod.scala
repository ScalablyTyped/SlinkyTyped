package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Touch
import typingsSlinky.smoothScrollbar.anon.XY
import typingsSlinky.smoothScrollbar.eventHubMod.EventHandler
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  
  def getPointerData(evt: js.Any): js.Any = js.native
  
  def getPosition(evt: js.Any): XY = js.native
  
  def isOneOf(a: js.Any): Boolean = js.native
  def isOneOf(a: js.Any, b: js.Array[_]): Boolean = js.native
  
  def setStyle(elem: HTMLElement, styles: js.Any): Unit = js.native
  
  @js.native
  class TouchRecord ()
    extends typingsSlinky.smoothScrollbar.touchRecordMod.TouchRecord
  
  @js.native
  class Tracker protected ()
    extends typingsSlinky.smoothScrollbar.touchRecordMod.Tracker {
    def this(touch: Touch) = this()
  }
}
