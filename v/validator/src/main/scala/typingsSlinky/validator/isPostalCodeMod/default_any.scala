package typingsSlinky.validator.isPostalCodeMod

import typingsSlinky.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isPostalCode", JSImport.Default)
@js.native
object default_any extends js.Object {
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  def apply(str: String, locale: any): Boolean = js.native
}

