package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentPoolReference extends StObject {
  
  var id: Double = js.native
  
  /**
    * Gets or sets a value indicating whether or not this pool is managed by the service.
    */
  var isHosted: Boolean = js.native
  
  var name: String = js.native
  
  /**
    * Gets or sets the type of the pool
    */
  var poolType: TaskAgentPoolType = js.native
  
  var scope: String = js.native
}
object TaskAgentPoolReference {
  
  @scala.inline
  def apply(id: Double, isHosted: Boolean, name: String, poolType: TaskAgentPoolType, scope: String): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poolType = poolType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
  
  @scala.inline
  implicit class TaskAgentPoolReferenceMutableBuilder[Self <: TaskAgentPoolReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHosted(value: Boolean): Self = StObject.set(x, "isHosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolType(value: TaskAgentPoolType): Self = StObject.set(x, "poolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
