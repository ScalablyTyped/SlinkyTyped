package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesNotFound extends StObject {
  
  var enumValues: NotFound = js.native
}
object EnumValuesNotFound {
  
  @scala.inline
  def apply(enumValues: NotFound): EnumValuesNotFound = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotFound]
  }
  
  @scala.inline
  implicit class EnumValuesNotFoundMutableBuilder[Self <: EnumValuesNotFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: NotFound): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
