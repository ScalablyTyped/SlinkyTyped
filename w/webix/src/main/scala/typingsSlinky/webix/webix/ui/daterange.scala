package typingsSlinky.webix.webix.ui

import typingsSlinky.webix.webix.Date
import typingsSlinky.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait daterange extends baseview {
  
  def addToRange(dates: String): Unit = js.native
  def addToRange(dates: Date): Unit = js.native
  
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_daterange: daterangeConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(range: js.Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
