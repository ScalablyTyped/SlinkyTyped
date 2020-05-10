package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcShelvesetRequestData extends js.Object {
  /**
    * Whether to include policyOverride and notes Only applies when requesting a single deep shelveset
    */
  var includeDetails: Boolean = js.native
  /**
    * Whether to include the _links field on the shallow references. Does not apply when requesting a single deep shelveset object. Links will always be included in the deep shelveset.
    */
  var includeLinks: Boolean = js.native
  /**
    * Whether to include workItems
    */
  var includeWorkItems: Boolean = js.native
  /**
    * Max number of changes to include
    */
  var maxChangeCount: Double = js.native
  /**
    * Max length of comment
    */
  var maxCommentLength: Double = js.native
  /**
    * Shelveset's name
    */
  var name: String = js.native
  /**
    * Owner's ID. Could be a name or a guid.
    */
  var owner: String = js.native
}

object TfvcShelvesetRequestData {
  @scala.inline
  def apply(
    includeDetails: Boolean,
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    maxChangeCount: Double,
    maxCommentLength: Double,
    name: String,
    owner: String
  ): TfvcShelvesetRequestData = {
    val __obj = js.Dynamic.literal(includeDetails = includeDetails.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], maxChangeCount = maxChangeCount.asInstanceOf[js.Any], maxCommentLength = maxCommentLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelvesetRequestData]
  }
  @scala.inline
  implicit class TfvcShelvesetRequestDataOps[Self <: TfvcShelvesetRequestData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeWorkItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWorkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxChangeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChangeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCommentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCommentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

