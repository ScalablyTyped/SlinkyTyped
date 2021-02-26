package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesContext extends StObject {
  
  var enumValues: Context = js.native
}
object EnumValuesContext {
  
  @scala.inline
  def apply(enumValues: Context): EnumValuesContext = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContext]
  }
  
  @scala.inline
  implicit class EnumValuesContextMutableBuilder[Self <: EnumValuesContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Context): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
