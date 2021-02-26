package typingsSlinky.smoothScrollbar

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Touch
import typingsSlinky.smoothScrollbar.anon.XY
import typingsSlinky.smoothScrollbar.eventHubMod.EventHandler
import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("smooth-scrollbar/utils", "TouchRecord")
  @js.native
  class TouchRecord ()
    extends typingsSlinky.smoothScrollbar.touchRecordMod.TouchRecord
  
  @JSImport("smooth-scrollbar/utils", "Tracker")
  @js.native
  class Tracker protected ()
    extends typingsSlinky.smoothScrollbar.touchRecordMod.Tracker {
    def this(touch: Touch) = this()
  }
  
  @JSImport("smooth-scrollbar/utils", "clearEventsOn")
  @js.native
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  
  @JSImport("smooth-scrollbar/utils", "eventScope")
  @js.native
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  
  @JSImport("smooth-scrollbar/utils", "getPointerData")
  @js.native
  def getPointerData(evt: js.Any): js.Any = js.native
  
  @JSImport("smooth-scrollbar/utils", "getPosition")
  @js.native
  def getPosition(evt: js.Any): XY = js.native
  
  @JSImport("smooth-scrollbar/utils", "isOneOf")
  @js.native
  def isOneOf(a: js.Any): Boolean = js.native
  @JSImport("smooth-scrollbar/utils", "isOneOf")
  @js.native
  def isOneOf(a: js.Any, b: js.Array[_]): Boolean = js.native
  
  @JSImport("smooth-scrollbar/utils", "setStyle")
  @js.native
  def setStyle(elem: HTMLElement, styles: js.Any): Unit = js.native
}
