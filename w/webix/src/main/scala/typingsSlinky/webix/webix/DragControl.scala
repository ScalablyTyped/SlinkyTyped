package typingsSlinky.webix.webix

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragControl extends js.Object {
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  var left: Double = js.native
  var top: Double = js.native
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event_): HTMLElement = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event_): Unit = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement, event: Event_): Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event_): Unit = js.native
  def addDrag(node: String, ctrl: js.Any): Unit = js.native
  def addDrag(node: Double, ctrl: js.Any): Unit = js.native
  def addDrag(node: typingsSlinky.std.HTMLElement, ctrl: js.Any): Unit = js.native
  def addDrop(node: String, ctrl: js.Any): Unit = js.native
  def addDrop(node: String, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: Double, ctrl: js.Any): Unit = js.native
  def addDrop(node: Double, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: typingsSlinky.std.HTMLElement, ctrl: js.Any): Unit = js.native
  def addDrop(node: typingsSlinky.std.HTMLElement, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def createDrag(event: Event_): Unit = js.native
  def destroyDrag(): Unit = js.native
  def getContext(): js.Any = js.native
  def getMaster(target: js.Any): js.Any = js.native
  def getNode(): HTMLElement = js.native
  def sendSignal(signal: String): Unit = js.native
}

@JSGlobal("webix.DragControl")
@js.native
object DragControl extends TopLevel[DragControl]

