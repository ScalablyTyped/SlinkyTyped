package typingsSlinky.uifabricUtilities

import typingsSlinky.uifabricUtilities.anon.Rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/rtl", JSImport.Namespace)
@js.native
object rtlMod extends js.Object {
  
  def getRTL(): Boolean = js.native
  def getRTL(theme: Rtl): Boolean = js.native
  
  def getRTLSafeKeyCode(key: Double): Double = js.native
  def getRTLSafeKeyCode(key: Double, theme: Rtl): Double = js.native
  
  def setRTL(isRTL: Boolean): Unit = js.native
  def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = js.native
}
