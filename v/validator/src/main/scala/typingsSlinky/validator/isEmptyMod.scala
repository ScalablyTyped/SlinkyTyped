package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isEmpty", JSImport.Namespace)
@js.native
object isEmptyMod extends js.Object {
  
  /**
    * Check if the string has a length of zero.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsEmptyOptions): Boolean = js.native
  
  type IsEmptyOptions = typingsSlinky.validator.mod.validator.IsEmptyOptions
}
