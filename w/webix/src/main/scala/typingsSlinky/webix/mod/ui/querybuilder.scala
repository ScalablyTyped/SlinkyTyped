package typingsSlinky.webix.mod.ui

import typingsSlinky.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.querybuilder")
@js.native
class querybuilder ()
  extends typingsSlinky.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_querybuilder: WebixCallback = js.native
  
  def attachEvent(`type`: querybuilderEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: querybuilderEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_querybuilder: querybuilderConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def eachLine(callback: WebixCallback): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getFilterHelper(): WebixCallback = js.native
  
  def getSortingElements(): js.Array[_] = js.native
  
  def getSortingHelper(): WebixCallback = js.native
  
  def getValue(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def setValue(value: js.Any): Unit = js.native
  
  var sqlOperators: js.Any = js.native
  
  def toSQL(): js.Any = js.native
  def toSQL(config: js.UndefOr[scala.Nothing], rules: js.Any): js.Any = js.native
  def toSQL(config: js.Any): js.Any = js.native
  def toSQL(config: js.Any, rules: js.Any): js.Any = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Unit = js.native
}
