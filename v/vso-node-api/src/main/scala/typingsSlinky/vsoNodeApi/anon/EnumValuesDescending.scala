package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDescending extends StObject {
  
  var enumValues: Descending = js.native
}
object EnumValuesDescending {
  
  @scala.inline
  def apply(enumValues: Descending): EnumValuesDescending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDescending]
  }
  
  @scala.inline
  implicit class EnumValuesDescendingMutableBuilder[Self <: EnumValuesDescending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Descending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
