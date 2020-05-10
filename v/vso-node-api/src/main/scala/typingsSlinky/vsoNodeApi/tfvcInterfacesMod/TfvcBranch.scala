package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcBranch extends TfvcBranchRef {
  /**
    * List of children for the branch.
    */
  var children: js.Array[TfvcBranch] = js.native
  /**
    * List of branch mappings.
    */
  var mappings: js.Array[TfvcBranchMapping] = js.native
  /**
    * Path of the branch's parent.
    */
  var parent: TfvcShallowBranchRef = js.native
  /**
    * List of paths of the related branches.
    */
  var relatedBranches: js.Array[TfvcShallowBranchRef] = js.native
}

object TfvcBranch {
  @scala.inline
  def apply(
    _links: js.Any,
    children: js.Array[TfvcBranch],
    createdDate: js.Date,
    description: String,
    isDeleted: Boolean,
    mappings: js.Array[TfvcBranchMapping],
    owner: IdentityRef,
    parent: TfvcShallowBranchRef,
    path: String,
    relatedBranches: js.Array[TfvcShallowBranchRef],
    url: String
  ): TfvcBranch = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relatedBranches = relatedBranches.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranch]
  }
  @scala.inline
  implicit class TfvcBranchOps[Self <: TfvcBranch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[TfvcBranch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappings(value: js.Array[TfvcBranchMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: TfvcShallowBranchRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedBranches(value: js.Array[TfvcShallowBranchRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedBranches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

