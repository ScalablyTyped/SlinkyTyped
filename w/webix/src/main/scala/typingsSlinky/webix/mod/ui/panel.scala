package typingsSlinky.webix.mod.ui

import typingsSlinky.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.panel")
@js.native
class panel ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$resizeEnd")
  def $resizeEnd(pos: Double): Unit = js.native
  
  @JSName("$resizeMove")
  def $resizeMove(pos: Double): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_panel: WebixCallback = js.native
  
  def attachEvent(`type`: panelEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: panelEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_panel: panelConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
