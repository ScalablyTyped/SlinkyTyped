package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isNumeric", JSImport.Namespace)
@js.native
object isNumericMod extends js.Object {
  
  /**
    * Check if the string contains only numbers.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsNumericOptions): Boolean = js.native
  
  type IsNumericOptions = typingsSlinky.validator.mod.validator.IsNumericOptions
}
