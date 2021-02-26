package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesChange extends StObject {
  
  var enumValues: Change = js.native
}
object EnumValuesChange {
  
  @scala.inline
  def apply(enumValues: Change): EnumValuesChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesChange]
  }
  
  @scala.inline
  implicit class EnumValuesChangeMutableBuilder[Self <: EnumValuesChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Change): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
