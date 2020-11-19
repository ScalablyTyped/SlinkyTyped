package typingsSlinky.validator

import typingsSlinky.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isIdentityCard", JSImport.Namespace)
@js.native
object isIdentityCardMod extends js.Object {
  
  /**
    * Check if the string is a valid identity card code.
    *
    * @param [locale="any"] - IdentityCardLocale
    */
  def default(str: String): Boolean = js.native
  def default(str: String, locale: typingsSlinky.validator.mod.validator.IdentityCardLocale): Boolean = js.native
  @JSName("default")
  def default_any(str: String, locale: any): Boolean = js.native
  
  type IdentityCardLocale = typingsSlinky.validator.mod.validator.IdentityCardLocale
}
