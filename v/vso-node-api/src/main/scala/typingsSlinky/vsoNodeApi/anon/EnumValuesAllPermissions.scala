package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAllPermissions extends StObject {
  
  var enumValues: AllPermissions = js.native
}
object EnumValuesAllPermissions {
  
  @scala.inline
  def apply(enumValues: AllPermissions): EnumValuesAllPermissions = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllPermissions]
  }
  
  @scala.inline
  implicit class EnumValuesAllPermissionsMutableBuilder[Self <: EnumValuesAllPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AllPermissions): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
