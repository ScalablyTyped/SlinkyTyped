package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAny extends StObject {
  
  var enumValues: Any = js.native
}
object EnumValuesAny {
  
  @scala.inline
  def apply(enumValues: Any): EnumValuesAny = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAny]
  }
  
  @scala.inline
  implicit class EnumValuesAnyMutableBuilder[Self <: EnumValuesAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Any): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
