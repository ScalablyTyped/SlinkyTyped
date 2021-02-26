package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcChangeset extends TfvcChangesetRef {
  
  /**
    * Account Id of the changeset.
    */
  var accountId: String = js.native
  
  /**
    * List of associated changes.
    */
  var changes: js.Array[TfvcChange] = js.native
  
  /**
    * Checkin Notes for the changeset.
    */
  var checkinNotes: js.Array[CheckinNote] = js.native
  
  /**
    * Collection Id of the changeset.
    */
  var collectionId: String = js.native
  
  /**
    * Are more changes available.
    */
  var hasMoreChanges: Boolean = js.native
  
  /**
    * Policy Override for the changeset.
    */
  var policyOverride: TfvcPolicyOverrideInfo = js.native
  
  /**
    * Team Project Ids for the changeset.
    */
  var teamProjectIds: js.Array[String] = js.native
  
  /**
    * List of work items associated with the changeset.
    */
  var workItems: js.Array[AssociatedWorkItem] = js.native
}
object TfvcChangeset {
  
  @scala.inline
  def apply(
    _links: js.Any,
    accountId: String,
    author: IdentityRef,
    changes: js.Array[TfvcChange],
    changesetId: Double,
    checkedInBy: IdentityRef,
    checkinNotes: js.Array[CheckinNote],
    collectionId: String,
    comment: String,
    commentTruncated: Boolean,
    createdDate: js.Date,
    hasMoreChanges: Boolean,
    policyOverride: TfvcPolicyOverrideInfo,
    teamProjectIds: js.Array[String],
    url: String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcChangeset = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], changesetId = changesetId.asInstanceOf[js.Any], checkedInBy = checkedInBy.asInstanceOf[js.Any], checkinNotes = checkinNotes.asInstanceOf[js.Any], collectionId = collectionId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], hasMoreChanges = hasMoreChanges.asInstanceOf[js.Any], policyOverride = policyOverride.asInstanceOf[js.Any], teamProjectIds = teamProjectIds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangeset]
  }
  
  @scala.inline
  implicit class TfvcChangesetMutableBuilder[Self <: TfvcChangeset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: js.Array[TfvcChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: TfvcChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setCheckinNotes(value: js.Array[CheckinNote]): Self = StObject.set(x, "checkinNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckinNotesVarargs(value: CheckinNote*): Self = StObject.set(x, "checkinNotes", js.Array(value :_*))
    
    @scala.inline
    def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreChanges(value: Boolean): Self = StObject.set(x, "hasMoreChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyOverride(value: TfvcPolicyOverrideInfo): Self = StObject.set(x, "policyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProjectIds(value: js.Array[String]): Self = StObject.set(x, "teamProjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProjectIdsVarargs(value: String*): Self = StObject.set(x, "teamProjectIds", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[AssociatedWorkItem]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: AssociatedWorkItem*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
