package typingsSlinky.validator.isDecimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isDecimal", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, options: typingsSlinky.validator.mod.validator.IsDecimalOptions): Boolean = js.native
}

