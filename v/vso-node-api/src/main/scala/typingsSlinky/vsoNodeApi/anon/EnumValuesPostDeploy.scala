package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesPostDeploy extends StObject {
  
  var enumValues: PostDeploy = js.native
}
object EnumValuesPostDeploy {
  
  @scala.inline
  def apply(enumValues: PostDeploy): EnumValuesPostDeploy = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPostDeploy]
  }
  
  @scala.inline
  implicit class EnumValuesPostDeployMutableBuilder[Self <: EnumValuesPostDeploy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: PostDeploy): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
