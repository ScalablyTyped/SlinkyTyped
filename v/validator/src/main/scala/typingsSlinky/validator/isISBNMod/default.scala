package typingsSlinky.validator.isISBNMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISBN", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  def apply(str: String): Boolean = js.native
  def apply(str: String, version: typingsSlinky.validator.mod.validator.ISBNVersion): Boolean = js.native
}

