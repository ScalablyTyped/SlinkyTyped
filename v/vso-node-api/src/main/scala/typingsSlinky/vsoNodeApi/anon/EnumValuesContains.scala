package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesContains extends StObject {
  
  var enumValues: Contains = js.native
}
object EnumValuesContains {
  
  @scala.inline
  def apply(enumValues: Contains): EnumValuesContains = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContains]
  }
  
  @scala.inline
  implicit class EnumValuesContainsMutableBuilder[Self <: EnumValuesContains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Contains): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
