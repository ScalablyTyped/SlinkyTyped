package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesTestPlan extends StObject {
  
  var enumValues: TestPlan = js.native
}
object EnumValuesTestPlan {
  
  @scala.inline
  def apply(enumValues: TestPlan): EnumValuesTestPlan = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTestPlan]
  }
  
  @scala.inline
  implicit class EnumValuesTestPlanMutableBuilder[Self <: EnumValuesTestPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: TestPlan): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
