package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesPartiallySucceeded extends StObject {
  
  var enumValues: PartiallySucceeded = js.native
}
object EnumValuesPartiallySucceeded {
  
  @scala.inline
  def apply(enumValues: PartiallySucceeded): EnumValuesPartiallySucceeded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPartiallySucceeded]
  }
  
  @scala.inline
  implicit class EnumValuesPartiallySucceededMutableBuilder[Self <: EnumValuesPartiallySucceeded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: PartiallySucceeded): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
