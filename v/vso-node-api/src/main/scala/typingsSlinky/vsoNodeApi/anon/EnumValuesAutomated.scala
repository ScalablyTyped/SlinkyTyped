package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAutomated extends StObject {
  
  var enumValues: Automated = js.native
}
object EnumValuesAutomated {
  
  @scala.inline
  def apply(enumValues: Automated): EnumValuesAutomated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutomated]
  }
  
  @scala.inline
  implicit class EnumValuesAutomatedMutableBuilder[Self <: EnumValuesAutomated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Automated): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
