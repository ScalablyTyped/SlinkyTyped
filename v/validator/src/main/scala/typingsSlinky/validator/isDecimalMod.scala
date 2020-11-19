package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isDecimal", JSImport.Namespace)
@js.native
object isDecimalMod extends js.Object {
  
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsDecimalOptions): Boolean = js.native
  
  type DecimalLocale = typingsSlinky.validator.mod.validator.DecimalLocale
  
  type IsDecimalOptions = typingsSlinky.validator.mod.validator.IsDecimalOptions
}
