package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestCommentThread extends CommentThread {
  
  /**
    * Extended context information unique to pull requests
    */
  var pullRequestThreadContext: GitPullRequestCommentThreadContext = js.native
}
object GitPullRequestCommentThread {
  
  @scala.inline
  def apply(
    _links: js.Any,
    comments: js.Array[Comment],
    id: Double,
    isDeleted: Boolean,
    lastUpdatedDate: js.Date,
    properties: js.Any,
    publishedDate: js.Date,
    pullRequestThreadContext: GitPullRequestCommentThreadContext,
    status: CommentThreadStatus,
    threadContext: CommentThreadContext
  ): GitPullRequestCommentThread = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], pullRequestThreadContext = pullRequestThreadContext.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threadContext = threadContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestCommentThread]
  }
  
  @scala.inline
  implicit class GitPullRequestCommentThreadMutableBuilder[Self <: GitPullRequestCommentThread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestThreadContext(value: GitPullRequestCommentThreadContext): Self = StObject.set(x, "pullRequestThreadContext", value.asInstanceOf[js.Any])
  }
}
