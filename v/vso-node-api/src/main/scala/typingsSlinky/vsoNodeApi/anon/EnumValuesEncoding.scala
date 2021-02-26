package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesEncoding extends StObject {
  
  var enumValues: Encoding = js.native
}
object EnumValuesEncoding {
  
  @scala.inline
  def apply(enumValues: Encoding): EnumValuesEncoding = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEncoding]
  }
  
  @scala.inline
  implicit class EnumValuesEncodingMutableBuilder[Self <: EnumValuesEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Encoding): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
