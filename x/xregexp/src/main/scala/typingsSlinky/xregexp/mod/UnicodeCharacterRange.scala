package typingsSlinky.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait UnicodeCharacterRange extends StObject
object UnicodeCharacterRange {
  
  @scala.inline
  def PickRequiredUnicodeCharac(astral: js.UndefOr[String] with String, name: String): typingsSlinky.xregexp.anon.PickRequiredUnicodeCharac = {
    val __obj = js.Dynamic.literal(astral = astral.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.xregexp.anon.PickRequiredUnicodeCharac]
  }
  
  @scala.inline
  def PickRequiredUnicodeCharacAlias(bmp: js.UndefOr[String] with String, name: String): typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAlias = {
    val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAlias]
  }
  
  @scala.inline
  def PickRequiredUnicodeCharacAstral(inverseOf: js.UndefOr[String] with String, name: String): typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAstral = {
    val __obj = js.Dynamic.literal(inverseOf = inverseOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.xregexp.anon.PickRequiredUnicodeCharacAstral]
  }
}
