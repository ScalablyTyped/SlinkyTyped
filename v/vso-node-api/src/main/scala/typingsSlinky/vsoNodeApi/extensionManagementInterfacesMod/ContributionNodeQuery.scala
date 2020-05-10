package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributionNodeQuery extends js.Object {
  /**
    * The contribution ids of the nodes to find.
    */
  var contributionIds: js.Array[String] = js.native
  /**
    * Indicator if contribution provider details should be included in the result.
    */
  var includeProviderDetails: Boolean = js.native
  /**
    * Query options tpo be used when fetching ContributionNodes
    */
  var queryOptions: ContributionQueryOptions = js.native
}

object ContributionNodeQuery {
  @scala.inline
  def apply(
    contributionIds: js.Array[String],
    includeProviderDetails: Boolean,
    queryOptions: ContributionQueryOptions
  ): ContributionNodeQuery = {
    val __obj = js.Dynamic.literal(contributionIds = contributionIds.asInstanceOf[js.Any], includeProviderDetails = includeProviderDetails.asInstanceOf[js.Any], queryOptions = queryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionNodeQuery]
  }
  @scala.inline
  implicit class ContributionNodeQueryOps[Self <: ContributionNodeQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeProviderDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeProviderDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryOptions(value: ContributionQueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

