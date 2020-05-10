package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcChangesetsRequestData extends js.Object {
  /**
    * List of changeset Ids.
    */
  var changesetIds: js.Array[Double] = js.native
  /**
    * Length of the comment.
    */
  var commentLength: Double = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
}

object TfvcChangesetsRequestData {
  @scala.inline
  def apply(changesetIds: js.Array[Double], commentLength: Double, includeLinks: Boolean): TfvcChangesetsRequestData = {
    val __obj = js.Dynamic.literal(changesetIds = changesetIds.asInstanceOf[js.Any], commentLength = commentLength.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetsRequestData]
  }
  @scala.inline
  implicit class TfvcChangesetsRequestDataOps[Self <: TfvcChangesetsRequestData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangesetIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changesetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

