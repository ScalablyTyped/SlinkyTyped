package typingsSlinky.xregexp.mod

import typingsSlinky.xregexp.anon.PickRequiredUnicodeCharac
import typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAlias
import typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAstral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Unicode character range.
  *
  * All properties but `name` are optional, although one of `bmp` or `astral` is required (unless `inverseOf` is set).
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.anon.PickRequiredUnicodeCharac
  - typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAlias
  - typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAstral
*/
trait UnicodeCharacterRange extends js.Object

object UnicodeCharacterRange {
  @scala.inline
  implicit def apply(value: PickRequiredUnicodeCharac): UnicodeCharacterRange = value.asInstanceOf[UnicodeCharacterRange]
  @scala.inline
  implicit def apply(value: PickRequiredUnicodeCharacAlias): UnicodeCharacterRange = value.asInstanceOf[UnicodeCharacterRange]
  @scala.inline
  implicit def apply(value: PickRequiredUnicodeCharacAstral): UnicodeCharacterRange = value.asInstanceOf[UnicodeCharacterRange]
}

