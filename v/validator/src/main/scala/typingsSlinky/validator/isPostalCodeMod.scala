package typingsSlinky.validator

import typingsSlinky.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isPostalCode", JSImport.Namespace)
@js.native
object isPostalCodeMod extends js.Object {
  def default(str: String, locale: typingsSlinky.validator.mod.validator.PostalCodeLocale): Boolean = js.native
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  @JSName("default")
  def default_any(str: String, locale: any): Boolean = js.native
  type PostalCodeLocale = typingsSlinky.validator.mod.validator.PostalCodeLocale
}

