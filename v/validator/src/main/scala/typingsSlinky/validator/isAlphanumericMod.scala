package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isAlphanumeric", JSImport.Namespace)
@js.native
object isAlphanumericMod extends js.Object {
  
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    */
  def default(str: String): Boolean = js.native
  def default(str: String, locale: typingsSlinky.validator.mod.validator.AlphanumericLocale): Boolean = js.native
  
  type AlphanumericLocale = typingsSlinky.validator.mod.validator.AlphanumericLocale
}
