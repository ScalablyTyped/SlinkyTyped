package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesNotDeployed extends StObject {
  
  var enumValues: NotDeployed = js.native
}
object EnumValuesNotDeployed {
  
  @scala.inline
  def apply(enumValues: NotDeployed): EnumValuesNotDeployed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotDeployed]
  }
  
  @scala.inline
  implicit class EnumValuesNotDeployedMutableBuilder[Self <: EnumValuesNotDeployed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: NotDeployed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
