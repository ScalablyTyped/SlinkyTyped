package typingsSlinky.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isAlphaMod {
  
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  @JSImport("validator/lib/isAlpha", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isAlpha", JSImport.Default)
  @js.native
  def default(str: String, locale: typingsSlinky.validator.mod.validator.AlphaLocale): Boolean = js.native
  
  type AlphaLocale = typingsSlinky.validator.mod.validator.AlphaLocale
}
