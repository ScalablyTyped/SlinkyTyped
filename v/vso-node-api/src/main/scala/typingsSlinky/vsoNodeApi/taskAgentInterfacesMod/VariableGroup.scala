package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableGroup extends StObject {
  
  var createdBy: IdentityRef = js.native
  
  var createdOn: js.Date = js.native
  
  var description: String = js.native
  
  var id: Double = js.native
  
  var modifiedBy: IdentityRef = js.native
  
  var modifiedOn: js.Date = js.native
  
  var name: String = js.native
  
  var variables: StringDictionary[VariableValue] = js.native
}
object VariableGroup {
  
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: js.Date,
    description: String,
    id: Double,
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    variables: StringDictionary[VariableValue]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroup]
  }
  
  @scala.inline
  implicit class VariableGroupMutableBuilder[Self <: VariableGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[VariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
