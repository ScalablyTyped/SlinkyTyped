package typingsSlinky.webix.mod.ui

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.window")
@js.native
class window ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_window: WebixCallback = js.native
  
  def attachEvent(`type`: windowEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: windowEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  def close(): Unit = js.native
  
  @JSName("config")
  var config_window: windowConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): js.Any = js.native
  
  def getHead(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setPosition(x: Double, y: Double): Unit = js.native
  
  def show(node: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], point: String): Unit = js.native
  def show(node: js.UndefOr[scala.Nothing], position: js.Any): Unit = js.native
  def show(node: js.UndefOr[scala.Nothing], position: js.Any, point: String): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: js.UndefOr[scala.Nothing], point: String): Unit = js.native
  def show(node: HTMLElement, position: js.Any): Unit = js.native
  def show(node: HTMLElement, position: js.Any, point: String): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
