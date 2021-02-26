package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.ResourceRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitRef extends StObject {
  
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
  implicit class GitCommitRefMutableBuilder[Self <: GitCommitRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: GitUserDate): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeCounts(value: ChangeCountDictionary): Self = StObject.set(x, "changeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: js.Array[GitChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: GitChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = StObject.set(x, "commentTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: GitUserDate): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses(value: js.Array[GitStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: GitStatus*): Self = StObject.set(x, "statuses", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: js.Array[ResourceRef]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: ResourceRef*): Self = StObject.set(x, "workItems", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
