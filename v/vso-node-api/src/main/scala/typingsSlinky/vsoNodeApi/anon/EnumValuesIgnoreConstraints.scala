package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesIgnoreConstraints extends StObject {
  
  var enumValues: IgnoreConstraints = js.native
}
object EnumValuesIgnoreConstraints {
  
  @scala.inline
  def apply(enumValues: IgnoreConstraints): EnumValuesIgnoreConstraints = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIgnoreConstraints]
  }
  
  @scala.inline
  implicit class EnumValuesIgnoreConstraintsMutableBuilder[Self <: EnumValuesIgnoreConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: IgnoreConstraints): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
