package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCanceled extends StObject {
  
  var enumValues: Canceled = js.native
}
object EnumValuesCanceled {
  
  @scala.inline
  def apply(enumValues: Canceled): EnumValuesCanceled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCanceled]
  }
  
  @scala.inline
  implicit class EnumValuesCanceledMutableBuilder[Self <: EnumValuesCanceled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Canceled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
