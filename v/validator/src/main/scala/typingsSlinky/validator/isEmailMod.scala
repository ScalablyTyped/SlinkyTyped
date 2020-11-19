package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isEmail", JSImport.Namespace)
@js.native
object isEmailMod extends js.Object {
  
  /**
    * Check if the string is an email.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsEmailOptions): Boolean = js.native
  
  type IsEmailOptions = typingsSlinky.validator.mod.validator.IsEmailOptions
}
