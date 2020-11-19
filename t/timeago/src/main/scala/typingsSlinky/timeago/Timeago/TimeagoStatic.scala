package typingsSlinky.timeago.Timeago

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeagoStatic extends js.Object {
  
  def apply(timestamp: String): String = js.native
  def apply(timestamp: Double): String = js.native
  def apply(timestamp: js.Date): String = js.native
  def apply(timestamp: Element): String = js.native
  
  def datetime(elem: Element): js.Date = js.native
  
  def inWords(distanceMillis: Double): String = js.native
  
  def isTime(elem: Element): Boolean = js.native
  
  def parse(timestamp: String): js.Date = js.native
  
  var settings: Settings = js.native
}
