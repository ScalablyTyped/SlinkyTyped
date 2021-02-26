package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableGroupReference extends StObject {
  
  /**
    * The ID of the variable group.
    */
  var id: Double = js.native
}
object VariableGroupReference {
  
  @scala.inline
  def apply(id: Double): VariableGroupReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroupReference]
  }
  
  @scala.inline
  implicit class VariableGroupReferenceMutableBuilder[Self <: VariableGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
