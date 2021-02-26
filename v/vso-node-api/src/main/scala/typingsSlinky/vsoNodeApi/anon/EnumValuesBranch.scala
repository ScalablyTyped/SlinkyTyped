package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBranch extends StObject {
  
  var enumValues: Branch = js.native
}
object EnumValuesBranch {
  
  @scala.inline
  def apply(enumValues: Branch): EnumValuesBranch = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBranch]
  }
  
  @scala.inline
  implicit class EnumValuesBranchMutableBuilder[Self <: EnumValuesBranch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Branch): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
