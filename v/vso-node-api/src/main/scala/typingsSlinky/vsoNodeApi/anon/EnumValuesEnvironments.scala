package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesEnvironments extends StObject {
  
  var enumValues: Environments = js.native
}
object EnumValuesEnvironments {
  
  @scala.inline
  def apply(enumValues: Environments): EnumValuesEnvironments = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEnvironments]
  }
  
  @scala.inline
  implicit class EnumValuesEnvironmentsMutableBuilder[Self <: EnumValuesEnvironments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Environments): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
