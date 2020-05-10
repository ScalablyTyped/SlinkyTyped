package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommitRef extends js.Object {
  /**
    * A collection of related REST reference links.
    */
  var _links: js.Any = js.native
  /**
    * Author of the commit.
    */
  var author: GitUserDate = js.native
  /**
    * Counts of the types of changes (edits, deletes, etc.) included with the commit.
    */
  var changeCounts: ChangeCountDictionary = js.native
  /**
    * An enumeration of the changes included with the commit.
    */
  var changes: js.Array[GitChange] = js.native
  /**
    * Comment or message of the commit.
    */
  var comment: String = js.native
  /**
    * Indicates if the comment is truncated from the full Git commit comment message.
    */
  var commentTruncated: Boolean = js.native
  /**
    * ID (SHA-1) of the commit.
    */
  var commitId: String = js.native
  /**
    * Committer of the commit.
    */
  var committer: GitUserDate = js.native
  /**
    * An enumeration of the parent commit IDs for this commit.
    */
  var parents: js.Array[String] = js.native
  /**
    * Remote URL path to the commit.
    */
  var remoteUrl: String = js.native
  /**
    * A list of status metadata from services and extensions that may associate additional information to the commit.
    */
  var statuses: js.Array[GitStatus] = js.native
  /**
    * REST URL for this resource.
    */
  var url: String = js.native
  /**
    * A list of workitems associated with this commit.
    */
  var workItems: js.Array[ResourceRef] = js.native
}

object GitCommitRef {
  @scala.inline
  def apply(
    _links: js.Any,
    author: GitUserDate,
    changeCounts: ChangeCountDictionary,
    changes: js.Array[GitChange],
    comment: String,
    commentTruncated: Boolean,
    commitId: String,
    committer: GitUserDate,
    parents: js.Array[String],
    remoteUrl: String,
    statuses: js.Array[GitStatus],
    url: String,
    workItems: js.Array[ResourceRef]
  ): GitCommitRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitRef]
  }
  @scala.inline
  implicit class GitCommitRefOps[Self <: GitCommitRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: GitUserDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeCounts(value: ChangeCountDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: js.Array[GitChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: GitUserDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: js.Array[GitStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: js.Array[ResourceRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

