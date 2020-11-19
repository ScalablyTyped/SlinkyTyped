package typingsSlinky.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends js.Object {
  
  def format(value: Double): String = js.native
  
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): js.Array[NumberFormatPart] = js.native
  
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}
