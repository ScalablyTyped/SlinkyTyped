package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesImport extends StObject {
  
  var enumValues: Import = js.native
}
object EnumValuesImport {
  
  @scala.inline
  def apply(enumValues: Import): EnumValuesImport = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesImport]
  }
  
  @scala.inline
  implicit class EnumValuesImportMutableBuilder[Self <: EnumValuesImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Import): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
