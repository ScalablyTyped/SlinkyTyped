package typingsSlinky.webix.mod.ui

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.radio")
@js.native
class radio ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$allowsClear")
  var $allowsClear: Boolean = js.native
  
  @JSName("$compareValue")
  def $compareValue(args: js.Any*): js.Any = js.native
  @JSName("$compareValue")
  var $compareValue_Original: WebixCallback = js.native
  
  @JSName("$getValue")
  def $getValue(): String = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: js.Any*): js.Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$render")
  def $render(args: js.Any*): js.Any = js.native
  
  @JSName("$renderIcon")
  def $renderIcon(args: js.Any*): js.Any = js.native
  @JSName("$renderIcon")
  var $renderIcon_Original: WebixCallback = js.native
  
  @JSName("$renderInput")
  def $renderInput(obj: js.Any, html: String, id: String): String = js.native
  @JSName("$renderInput")
  def $renderInput(obj: js.Any, html: String, id: Double): String = js.native
  
  @JSName("$renderLabel")
  def $renderLabel(config: js.Any, id: String): String = js.native
  @JSName("$renderLabel")
  def $renderLabel(config: js.Any, id: Double): String = js.native
  
  @JSName("$render")
  var $render_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_radio: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def addOption(id: String, value: js.Any): Unit = js.native
  def addOption(id: String, value: js.Any, show: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def addOption(id: String, value: js.Any, show: Boolean): Unit = js.native
  def addOption(id: String, value: js.Any, show: Boolean, index: Double): Unit = js.native
  def addOption(id: Double, value: js.Any): Unit = js.native
  def addOption(id: Double, value: js.Any, show: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def addOption(id: Double, value: js.Any, show: Boolean): Unit = js.native
  def addOption(id: Double, value: js.Any, show: Boolean, index: Double): Unit = js.native
  
  def attachEvent(`type`: radioEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: radioEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def blur(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_radio: radioConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def disableOption(id: String): Unit = js.native
  def disableOption(id: Double): Unit = js.native
  
  def enableOption(id: String): Unit = js.native
  def enableOption(id: Double): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInputNode(): HTMLElement = js.native
  
  def getOption(id: String): js.Any = js.native
  def getOption(id: Double): js.Any = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def hideOption(id: String): Unit = js.native
  def hideOption(id: Double): Unit = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def on_click(args: js.Any*): js.Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  def optionIndex(ID: String): Double = js.native
  def optionIndex(ID: Double): Double = js.native
  
  def refresh(): Unit = js.native
  
  def removeOption(id: String): Unit = js.native
  def removeOption(id: Double): Unit = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def setBottomText(text: String): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def showOption(id: String): Unit = js.native
  def showOption(id: Double): Unit = js.native
  
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var touchable: Boolean = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
}
