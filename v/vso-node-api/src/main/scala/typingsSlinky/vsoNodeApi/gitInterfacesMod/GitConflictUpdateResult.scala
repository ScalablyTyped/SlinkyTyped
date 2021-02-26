package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitConflictUpdateResult extends StObject {
  
  /**
    * Conflict ID that was provided by input
    */
  var conflictId: Double = js.native
  
  /**
    * Reason for failing
    */
  var customMessage: String = js.native
  
  /**
    * Status of the update on the server
    */
  var updateStatus: GitConflictUpdateStatus = js.native
  
  /**
    * New state of the conflict after updating
    */
  var updatedConflict: GitConflict = js.native
}
object GitConflictUpdateResult {
  
  @scala.inline
  def apply(
    conflictId: Double,
    customMessage: String,
    updateStatus: GitConflictUpdateStatus,
    updatedConflict: GitConflict
  ): GitConflictUpdateResult = {
    val __obj = js.Dynamic.literal(conflictId = conflictId.asInstanceOf[js.Any], customMessage = customMessage.asInstanceOf[js.Any], updateStatus = updateStatus.asInstanceOf[js.Any], updatedConflict = updatedConflict.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictUpdateResult]
  }
  
  @scala.inline
  implicit class GitConflictUpdateResultMutableBuilder[Self <: GitConflictUpdateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflictId(value: Double): Self = StObject.set(x, "conflictId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatus(value: GitConflictUpdateStatus): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedConflict(value: GitConflict): Self = StObject.set(x, "updatedConflict", value.asInstanceOf[js.Any])
  }
}
