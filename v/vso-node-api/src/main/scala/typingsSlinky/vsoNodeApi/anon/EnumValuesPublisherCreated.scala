package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesPublisherCreated extends StObject {
  
  var enumValues: PublisherCreated = js.native
}
object EnumValuesPublisherCreated {
  
  @scala.inline
  def apply(enumValues: PublisherCreated): EnumValuesPublisherCreated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPublisherCreated]
  }
  
  @scala.inline
  implicit class EnumValuesPublisherCreatedMutableBuilder[Self <: EnumValuesPublisherCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: PublisherCreated): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
