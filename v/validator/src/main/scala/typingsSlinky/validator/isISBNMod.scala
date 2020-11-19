package typingsSlinky.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isISBN", JSImport.Namespace)
@js.native
object isISBNMod extends js.Object {
  
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  def default(str: String): Boolean = js.native
  def default(str: String, version: typingsSlinky.validator.mod.validator.ISBNVersion): Boolean = js.native
  
  type ISBNVersion = typingsSlinky.validator.mod.validator.ISBNVersion
}
