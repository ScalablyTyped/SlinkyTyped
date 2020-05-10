package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class TfvcChangesetOps[Self <: TfvcChangeset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: js.Array[TfvcChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckinNotes(value: js.Array[CheckinNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkinNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoreChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyOverride(value: TfvcPolicyOverrideInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamProjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: js.Array[AssociatedWorkItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

