package typingsSlinky.validator.isAlphanumericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAlphanumeric", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, locale: typingsSlinky.validator.mod.validator.AlphanumericLocale): Boolean = js.native
}

