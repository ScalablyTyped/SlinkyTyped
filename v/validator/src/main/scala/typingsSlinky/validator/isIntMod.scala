package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isInt", JSImport.Namespace)
@js.native
object isIntMod extends js.Object {
  
  /**
    * Check if the string is an integer.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsIntOptions): Boolean = js.native
  
  type IsIntOptions = typingsSlinky.validator.mod.validator.IsIntOptions
}
