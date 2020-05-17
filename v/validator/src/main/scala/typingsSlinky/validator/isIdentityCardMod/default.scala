package typingsSlinky.validator.isIdentityCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isIdentityCard", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string is a valid identity card code.
    *
    * @param [locale="any"] - IdentityCardLocale
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, locale: typingsSlinky.validator.mod.validator.IdentityCardLocale): Boolean = js.native
}

