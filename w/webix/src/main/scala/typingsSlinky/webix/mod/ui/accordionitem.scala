package typingsSlinky.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.accordionitem")
@js.native
class accordionitem ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_accordionitem: WebixCallback = js.native
  
  def attachEvent(`type`: accordionitemEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: accordionitemEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  def collapse(): Unit = js.native
  
  @JSName("config")
  var config_accordionitem: accordionitemConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def expand(): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def on_click(args: js.Any*): js.Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  var on_context: StringDictionary[js.Any] = js.native
  
  def on_dblclick(args: js.Any*): js.Any = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  
  def on_mouse_move(args: js.Any*): js.Any = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  
  def refresh(): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
