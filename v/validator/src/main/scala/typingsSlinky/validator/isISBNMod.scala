package typingsSlinky.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISBNMod {
  
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  @JSImport("validator/lib/isISBN", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isISBN", JSImport.Default)
  @js.native
  def default(str: String, version: typingsSlinky.validator.mod.validator.ISBNVersion): Boolean = js.native
  
  type ISBNVersion = typingsSlinky.validator.mod.validator.ISBNVersion
}
