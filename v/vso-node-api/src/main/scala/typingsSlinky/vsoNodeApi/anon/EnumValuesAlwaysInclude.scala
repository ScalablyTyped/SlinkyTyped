package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAlwaysInclude extends StObject {
  
  var enumValues: AlwaysInclude = js.native
}
object EnumValuesAlwaysInclude {
  
  @scala.inline
  def apply(enumValues: AlwaysInclude): EnumValuesAlwaysInclude = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAlwaysInclude]
  }
  
  @scala.inline
  implicit class EnumValuesAlwaysIncludeMutableBuilder[Self <: EnumValuesAlwaysInclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AlwaysInclude): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
