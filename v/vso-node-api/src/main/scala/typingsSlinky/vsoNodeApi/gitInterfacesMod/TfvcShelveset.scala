package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcShelveset extends TfvcShelvesetRef {
  var changes: js.Array[TfvcChange] = js.native
  var notes: js.Array[CheckinNote] = js.native
  var policyOverride: TfvcPolicyOverrideInfo = js.native
  var workItems: js.Array[AssociatedWorkItem] = js.native
}

object TfvcShelveset {
  @scala.inline
  def apply(
    _links: js.Any,
    changes: js.Array[TfvcChange],
    comment: String,
    commentTruncated: Boolean,
    createdDate: js.Date,
    id: String,
    name: String,
    notes: js.Array[CheckinNote],
    owner: IdentityRef,
    policyOverride: TfvcPolicyOverrideInfo,
    url: String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcShelveset = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], policyOverride = policyOverride.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelveset]
  }
  @scala.inline
  implicit class TfvcShelvesetOps[Self <: TfvcShelveset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[TfvcChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[CheckinNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyOverride(value: TfvcPolicyOverrideInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyOverride")(value.asInstanceOf[js.Any])
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

