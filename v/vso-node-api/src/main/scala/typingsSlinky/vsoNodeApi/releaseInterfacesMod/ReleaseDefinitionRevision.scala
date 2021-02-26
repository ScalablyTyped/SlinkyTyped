package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionRevision extends StObject {
  
  /**
    * Gets api-version for revision object.
    */
  var apiVersion: String = js.native
  
  /**
    * Gets type of change.
    */
  var changeType: AuditAction = js.native
  
  /**
    * Gets the identity who did change.
    */
  var changedBy: IdentityRef = js.native
  
  /**
    * Gets date on which it got changed.
    */
  var changedDate: js.Date = js.native
  
  /**
    * Gets comments for revision.
    */
  var comment: String = js.native
  
  /**
    * Get id of the definition.
    */
  var definitionId: Double = js.native
  
  /**
    * Gets definition url.
    */
  var definitionUrl: String = js.native
  
  /**
    * Get revision number of the definition.
    */
  var revision: Double = js.native
}
object ReleaseDefinitionRevision {
  
  @scala.inline
  def apply(
    apiVersion: String,
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    definitionId: Double,
    definitionUrl: String,
    revision: Double
  ): ReleaseDefinitionRevision = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionRevision]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionRevisionMutableBuilder[Self <: ReleaseDefinitionRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: js.Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUrl(value: String): Self = StObject.set(x, "definitionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
