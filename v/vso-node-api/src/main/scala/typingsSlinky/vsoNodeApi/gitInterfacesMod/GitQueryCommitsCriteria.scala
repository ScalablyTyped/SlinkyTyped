package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitQueryCommitsCriteria extends js.Object {
  /**
    * Number of entries to skip
    */
  @JSName("$skip")
  var $skip: Double = js.native
  /**
    * Maximum number of entries to retrieve
    */
  @JSName("$top")
  var $top: Double = js.native
  /**
    * Alias or display name of the author
    */
  var author: String = js.native
  /**
    * If provided, the earliest commit in the graph to search
    */
  var compareVersion: GitVersionDescriptor = js.native
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean = js.native
  /**
    * If provided, a lower bound for filtering commits alphabetically
    */
  var fromCommitId: String = js.native
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String = js.native
  /**
    * What Git history mode should be used. This only applies to the search criteria when Ids = null.
    */
  var historyMode: GitHistoryMode = js.native
  /**
    * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.
    */
  var ids: js.Array[String] = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  /**
    * Whether to include linked work items
    */
  var includeWorkItems: Boolean = js.native
  /**
    * Path of item to search under
    */
  var itemPath: String = js.native
  /**
    * If provided, identifies the commit or branch to search
    */
  var itemVersion: GitVersionDescriptor = js.native
  /**
    * If provided, an upper bound for filtering commits alphabetically
    */
  var toCommitId: String = js.native
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String = js.native
  /**
    * Alias or display name of the committer
    */
  var user: String = js.native
}

object GitQueryCommitsCriteria {
  @scala.inline
  def apply(
    $skip: Double,
    $top: Double,
    author: String,
    compareVersion: GitVersionDescriptor,
    excludeDeletes: Boolean,
    fromCommitId: String,
    fromDate: String,
    historyMode: GitHistoryMode,
    ids: js.Array[String],
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    itemPath: String,
    itemVersion: GitVersionDescriptor,
    toCommitId: String,
    toDate: String,
    user: String
  ): GitQueryCommitsCriteria = {
    val __obj = js.Dynamic.literal($skip = $skip.asInstanceOf[js.Any], $top = $top.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], compareVersion = compareVersion.asInstanceOf[js.Any], excludeDeletes = excludeDeletes.asInstanceOf[js.Any], fromCommitId = fromCommitId.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], historyMode = historyMode.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], itemVersion = itemVersion.asInstanceOf[js.Any], toCommitId = toCommitId.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryCommitsCriteria]
  }
  @scala.inline
  implicit class GitQueryCommitsCriteriaOps[Self <: GitQueryCommitsCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$skip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompareVersion(value: GitVersionDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeDeletes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDeletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistoryMode(value: GitHistoryMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
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
    def withItemPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemVersion(value: GitVersionDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

