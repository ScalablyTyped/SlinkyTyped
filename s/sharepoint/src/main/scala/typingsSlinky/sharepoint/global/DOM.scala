package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.Window
import typingsSlinky.sharepoint.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("DOM")
@js.native
object DOM extends js.Object {
  val rightToLeft: Boolean = js.native
  def AbsLeft(el: HTMLElement): Double = js.native
  def AbsTop(el: HTMLElement): Double = js.native
  def CancelEvent(evt: Event): Unit = js.native
  def GetElementsByName(nae: String): NodeList = js.native
  def GetEventCoords(evt: Event): X = js.native
  def GetEventSrcElement(evt: Event): HTMLElement = js.native
  def GetInnerText(el: HTMLElement): String = js.native
  def PreventDefaultNavigation(evt: Event): Unit = js.native
  def SetEvent(
    eventName: String,
    eventFunc: js.Function3[
      /* eventName */ String, 
      /* fnContent */ js.Function1[/* evt */ Event, Unit], 
      /* window */ js.UndefOr[Window], 
      Unit
    ],
    el: HTMLElement
  ): Unit = js.native
  def cancelDefault(evt: Event): Unit = js.native
}

