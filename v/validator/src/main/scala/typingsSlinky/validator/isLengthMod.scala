package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isLength", JSImport.Namespace)
@js.native
object isLengthMod extends js.Object {
  
  /**
    * Check if the string's length falls in a range.
    *
    * Note: this function takes into account surrogate pairs.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsLengthOptions): Boolean = js.native
  
  type IsLengthOptions = typingsSlinky.validator.mod.validator.IsLengthOptions
}
