package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAvatarAndFullName extends StObject {
  
  var enumValues: AvatarAndFullName = js.native
}
object EnumValuesAvatarAndFullName {
  
  @scala.inline
  def apply(enumValues: AvatarAndFullName): EnumValuesAvatarAndFullName = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAvatarAndFullName]
  }
  
  @scala.inline
  implicit class EnumValuesAvatarAndFullNameMutableBuilder[Self <: EnumValuesAvatarAndFullName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AvatarAndFullName): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
