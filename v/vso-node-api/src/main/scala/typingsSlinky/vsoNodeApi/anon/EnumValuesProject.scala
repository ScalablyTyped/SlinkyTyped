package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesProject extends StObject {
  
  var enumValues: Project = js.native
}
object EnumValuesProject {
  
  @scala.inline
  def apply(enumValues: Project): EnumValuesProject = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesProject]
  }
  
  @scala.inline
  implicit class EnumValuesProjectMutableBuilder[Self <: EnumValuesProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Project): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
