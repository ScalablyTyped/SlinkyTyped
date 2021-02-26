package typingsSlinky.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat extends StObject {
  
  def format(): String = js.native
  def format(date: js.Date): String = js.native
  def format(date: Double): String = js.native
  
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: js.Date): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): js.Array[DateTimeFormatPart] = js.native
  
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}
