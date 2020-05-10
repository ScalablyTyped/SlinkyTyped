package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcChangesetSearchCriteria extends js.Object {
  /**
    * Alias or display name of user who made the changes
    */
  var author: String = js.native
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean = js.native
  /**
    * If provided, only include changesets created after this date (string) Think of a better name for this.
    */
  var fromDate: String = js.native
  /**
    * If provided, only include changesets after this changesetID
    */
  var fromId: Double = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  /**
    * Path of item to search under
    */
  var itemPath: String = js.native
  /**
    * If provided, only include changesets created before this date (string) Think of a better name for this.
    */
  var toDate: String = js.native
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toId: Double = js.native
}

object TfvcChangesetSearchCriteria {
  @scala.inline
  def apply(
    author: String,
    followRenames: Boolean,
    fromDate: String,
    fromId: Double,
    includeLinks: Boolean,
    itemPath: String,
    toDate: String,
    toId: Double
  ): TfvcChangesetSearchCriteria = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], followRenames = followRenames.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], fromId = fromId.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetSearchCriteria]
  }
  @scala.inline
  implicit class TfvcChangesetSearchCriteriaOps[Self <: TfvcChangesetSearchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowRenames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRenames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

