package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcLabelRequestData extends js.Object {
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  var itemLabelFilter: String = js.native
  var labelScope: String = js.native
  var maxItemCount: Double = js.native
  var name: String = js.native
  var owner: String = js.native
}

object TfvcLabelRequestData {
  @scala.inline
  def apply(
    includeLinks: Boolean,
    itemLabelFilter: String,
    labelScope: String,
    maxItemCount: Double,
    name: String,
    owner: String
  ): TfvcLabelRequestData = {
    val __obj = js.Dynamic.literal(includeLinks = includeLinks.asInstanceOf[js.Any], itemLabelFilter = itemLabelFilter.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], maxItemCount = maxItemCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcLabelRequestData]
  }
  @scala.inline
  implicit class TfvcLabelRequestDataOps[Self <: TfvcLabelRequestData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLabelFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLabelFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(value.asInstanceOf[js.Any])
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

