package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestCommentThreadContext extends js.Object {
  /**
    * Used to track a comment across iterations. This value can be found by looking at the iteration's changes list. Must be set for pull requests with iteration support. Otherwise, it's not required for 'legacy' pull requests.
    */
  var changeTrackingId: Double = js.native
  /**
    * The iteration context being viewed when the thread was created.
    */
  var iterationContext: CommentIterationContext = js.native
  /**
    * The criteria used to track this thread. If this property is filled out when the thread is returned, then the thread has been tracked from its original location using the given criteria.
    */
  var trackingCriteria: CommentTrackingCriteria = js.native
}

object GitPullRequestCommentThreadContext {
  @scala.inline
  def apply(
    changeTrackingId: Double,
    iterationContext: CommentIterationContext,
    trackingCriteria: CommentTrackingCriteria
  ): GitPullRequestCommentThreadContext = {
    val __obj = js.Dynamic.literal(changeTrackingId = changeTrackingId.asInstanceOf[js.Any], iterationContext = iterationContext.asInstanceOf[js.Any], trackingCriteria = trackingCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestCommentThreadContext]
  }
  @scala.inline
  implicit class GitPullRequestCommentThreadContextOps[Self <: GitPullRequestCommentThreadContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeTrackingId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTrackingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterationContext(value: CommentIterationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingCriteria(value: CommentTrackingCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingCriteria")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

