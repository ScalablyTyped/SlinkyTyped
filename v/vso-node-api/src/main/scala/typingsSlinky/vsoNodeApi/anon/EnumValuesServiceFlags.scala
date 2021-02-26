package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesServiceFlags extends StObject {
  
  var enumValues: ServiceFlags = js.native
}
object EnumValuesServiceFlags {
  
  @scala.inline
  def apply(enumValues: ServiceFlags): EnumValuesServiceFlags = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesServiceFlags]
  }
  
  @scala.inline
  implicit class EnumValuesServiceFlagsMutableBuilder[Self <: EnumValuesServiceFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ServiceFlags): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
