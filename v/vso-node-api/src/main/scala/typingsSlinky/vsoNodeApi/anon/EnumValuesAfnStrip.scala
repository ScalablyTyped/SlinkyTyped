package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAfnStrip extends StObject {
  
  var enumValues: AfnStrip = js.native
}
object EnumValuesAfnStrip {
  
  @scala.inline
  def apply(enumValues: AfnStrip): EnumValuesAfnStrip = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAfnStrip]
  }
  
  @scala.inline
  implicit class EnumValuesAfnStripMutableBuilder[Self <: EnumValuesAfnStrip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AfnStrip): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
