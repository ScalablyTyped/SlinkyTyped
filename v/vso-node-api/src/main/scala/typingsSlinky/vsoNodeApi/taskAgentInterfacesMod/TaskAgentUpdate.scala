package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentUpdate extends StObject {
  
  /**
    * The current state of this agent update
    */
  var currentState: String = js.native
  
  /**
    * Gets the date on which this agent update was requested.
    */
  var requestTime: js.Date = js.native
  
  /**
    * The identity that request the agent update
    */
  var requestedBy: IdentityRef = js.native
  
  /**
    * Gets or sets the source agent version of the agent update
    */
  var sourceVersion: PackageVersion = js.native
  
  /**
    * Gets or sets the target agent version of the agent update
    */
  var targetVersion: PackageVersion = js.native
}
object TaskAgentUpdate {
  
  @scala.inline
  def apply(
    currentState: String,
    requestTime: js.Date,
    requestedBy: IdentityRef,
    sourceVersion: PackageVersion,
    targetVersion: PackageVersion
  ): TaskAgentUpdate = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentUpdate]
  }
  
  @scala.inline
  implicit class TaskAgentUpdateMutableBuilder[Self <: TaskAgentUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTime(value: js.Date): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersion(value: PackageVersion): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersion(value: PackageVersion): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
  }
}
