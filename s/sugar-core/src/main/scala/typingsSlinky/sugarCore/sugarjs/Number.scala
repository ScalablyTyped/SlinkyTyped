package typingsSlinky.sugarCore.sugarjs

import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sugarjs.Number")
@js.native
object Number extends js.Object {
  
  @js.native
  trait ChainableBase[RawValue] extends js.Object {
    
    var raw: RawValue = js.native
    
    def toExponential(): SugarDefaultChainable[java.lang.String] = js.native
    def toExponential(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toFixed(): SugarDefaultChainable[java.lang.String] = js.native
    def toFixed(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleString(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.Array[java.lang.String], options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toPrecision(): SugarDefaultChainable[java.lang.String] = js.native
    def toPrecision(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typingsSlinky.sugarCore.sugarjs.Object.ChainableBase[RawValue]
}
