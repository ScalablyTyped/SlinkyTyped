package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDelayRangeStart extends StObject {
  
  var enumValues: DelayRangeStart = js.native
}
object EnumValuesDelayRangeStart {
  
  @scala.inline
  def apply(enumValues: DelayRangeStart): EnumValuesDelayRangeStart = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDelayRangeStart]
  }
  
  @scala.inline
  implicit class EnumValuesDelayRangeStartMutableBuilder[Self <: EnumValuesDelayRangeStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: DelayRangeStart): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
