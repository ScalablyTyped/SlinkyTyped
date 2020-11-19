package typingsSlinky.webix.mod.ui

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.iframe")
@js.native
class iframe ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_iframe: WebixCallback = js.native
  
  def attachEvent(`type`: iframeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: iframeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_iframe: iframeConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getIframe(): HTMLElement = js.native
  
  def getWindow(): HTMLElement = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def load(value: String): Unit = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
