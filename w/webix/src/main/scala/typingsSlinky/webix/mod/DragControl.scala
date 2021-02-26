package typingsSlinky.webix.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragControl extends StObject {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): HTMLElement = js.native
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement, event: Event): Unit = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  
  def addDrag(node: String, ctrl: js.Any): Unit = js.native
  def addDrag(node: HTMLElement, ctrl: js.Any): Unit = js.native
  def addDrag(node: Double, ctrl: js.Any): Unit = js.native
  
  def addDrop(node: String, ctrl: js.Any): Unit = js.native
  def addDrop(node: String, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: HTMLElement, ctrl: js.Any): Unit = js.native
  def addDrop(node: HTMLElement, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: Double, ctrl: js.Any): Unit = js.native
  def addDrop(node: Double, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  
  def createDrag(event: Event): Unit = js.native
  
  def destroyDrag(): Unit = js.native
  
  def getContext(): js.Any = js.native
  
  def getMaster(target: js.Any): js.Any = js.native
  
  def getNode(): HTMLElement = js.native
  
  var left: Double = js.native
  
  def sendSignal(signal: String): Unit = js.native
  
  var top: Double = js.native
}
