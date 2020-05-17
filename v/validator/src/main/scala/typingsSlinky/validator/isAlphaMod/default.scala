package typingsSlinky.validator.isAlphaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAlpha", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, locale: typingsSlinky.validator.mod.validator.AlphaLocale): Boolean = js.native
}

