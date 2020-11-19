package typingsSlinky.styleValueTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("style-value-types/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def clamp(min: Double, max: Double): js.Function1[/* v */ Double, Double] = js.native
  
  val colorRegex: js.RegExp = js.native
  
  val floatRegex: js.RegExp = js.native
  
  def sanitize(v: Double): Double = js.native
  
  val singleColorRegex: js.RegExp = js.native
}
