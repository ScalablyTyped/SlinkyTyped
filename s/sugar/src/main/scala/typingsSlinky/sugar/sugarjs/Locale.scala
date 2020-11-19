package typingsSlinky.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  def addFormat(src: java.lang.String): Unit = js.native
  def addFormat(src: java.lang.String, to: typingsSlinky.sugar.Array[java.lang.String]): Unit = js.native
  
  def getDuration(ms: Double): java.lang.String = js.native
  
  def getFirstDayOfWeek(): Double = js.native
  
  def getFirstDayOfWeekYear(): Double = js.native
  
  def getMonthName(n: Double): java.lang.String = js.native
  
  def getWeekdayName(n: Double): java.lang.String = js.native
}
