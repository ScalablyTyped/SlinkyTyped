package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Unicode character range.
  *
  * All properties but `name` are optional, although one of `bmp` or `astral` is required (unless `inverseOf` is set).
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.PickRequiredUnicodeCharac
  - typingsSlinky.xregexp.PickRequiredUnicodeCharacAlias
  - typingsSlinky.xregexp.PickRequiredUnicodeCharacAstral
*/
trait UnicodeCharacterRange extends js.Object

object UnicodeCharacterRange {
  @scala.inline
  def PickRequiredUnicodeCharac(name: String): UnicodeCharacterRange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRange]
  }
  @scala.inline
  def PickRequiredUnicodeCharacAlias(name: String): UnicodeCharacterRange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRange]
  }
  @scala.inline
  def PickRequiredUnicodeCharacAstral(name: String): UnicodeCharacterRange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRange]
  }
}

