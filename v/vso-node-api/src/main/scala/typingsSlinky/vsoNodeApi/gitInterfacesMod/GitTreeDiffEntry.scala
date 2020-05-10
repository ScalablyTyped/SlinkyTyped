package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitTreeDiffEntry extends js.Object {
  /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
  var baseObjectId: String = js.native
  /**
    * Type of change that affected this entry.
    */
  var changeType: VersionControlChangeType = js.native
  /**
    * Object type of the tree entry. Blob, Tree or Commit("submodule")
    */
  var objectType: GitObjectType = js.native
  /**
    * Relative path in base and target trees.
    */
  var path: String = js.native
  /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
  var targetObjectId: String = js.native
}

object GitTreeDiffEntry {
  @scala.inline
  def apply(
    baseObjectId: String,
    changeType: VersionControlChangeType,
    objectType: GitObjectType,
    path: String,
    targetObjectId: String
  ): GitTreeDiffEntry = {
    val __obj = js.Dynamic.literal(baseObjectId = baseObjectId.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], targetObjectId = targetObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeDiffEntry]
  }
  @scala.inline
  implicit class GitTreeDiffEntryOps[Self <: GitTreeDiffEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeType(value: VersionControlChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: GitObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetObjectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

