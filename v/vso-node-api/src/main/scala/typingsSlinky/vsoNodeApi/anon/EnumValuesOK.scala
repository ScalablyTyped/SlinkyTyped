package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesOK extends StObject {
  
  var enumValues: OK = js.native
}
object EnumValuesOK {
  
  @scala.inline
  def apply(enumValues: OK): EnumValuesOK = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOK]
  }
  
  @scala.inline
  implicit class EnumValuesOKMutableBuilder[Self <: EnumValuesOK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: OK): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
