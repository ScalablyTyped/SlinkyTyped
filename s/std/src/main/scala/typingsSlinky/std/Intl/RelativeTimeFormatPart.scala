package typingsSlinky.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the relative time format in parts
  * that can be used for custom locale-aware formatting.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts#Using_formatToParts).
  *
  * [Specification](https://tc39.es/ecma402/#sec-FormatRelativeTimeToParts).
  */
@js.native
trait RelativeTimeFormatPart extends StObject {
  
  var `type`: String = js.native
  
  var unit: js.UndefOr[RelativeTimeFormatUnit] = js.native
  
  var value: String = js.native
}
object RelativeTimeFormatPart {
  
  @scala.inline
  def apply(`type`: String, value: String): RelativeTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatPart]
  }
  
  @scala.inline
  implicit class RelativeTimeFormatPartMutableBuilder[Self <: RelativeTimeFormatPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: RelativeTimeFormatUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
