package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDesigner extends StObject {
  
  var enumValues: Designer = js.native
}
object EnumValuesDesigner {
  
  @scala.inline
  def apply(enumValues: Designer): EnumValuesDesigner = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDesigner]
  }
  
  @scala.inline
  implicit class EnumValuesDesignerMutableBuilder[Self <: EnumValuesDesigner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Designer): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
