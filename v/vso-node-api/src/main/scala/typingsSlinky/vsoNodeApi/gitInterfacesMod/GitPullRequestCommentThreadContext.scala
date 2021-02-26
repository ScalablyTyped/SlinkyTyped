package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestCommentThreadContext extends StObject {
  
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
  implicit class GitPullRequestCommentThreadContextMutableBuilder[Self <: GitPullRequestCommentThreadContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeTrackingId(value: Double): Self = StObject.set(x, "changeTrackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationContext(value: CommentIterationContext): Self = StObject.set(x, "iterationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingCriteria(value: CommentTrackingCriteria): Self = StObject.set(x, "trackingCriteria", value.asInstanceOf[js.Any])
  }
}
