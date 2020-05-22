package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isFloat", JSImport.Namespace)
@js.native
object isFloatMod extends js.Object {
  /**
    * Check if the string is a float.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typingsSlinky.validator.mod.validator.IsFloatOptions): Boolean = js.native
  type FloatLocale = typingsSlinky.validator.mod.validator.FloatLocale
  type IsFloatOptions = typingsSlinky.validator.mod.validator.IsFloatOptions
}

