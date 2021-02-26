package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPush extends GitPushRef {
  
  var commits: js.Array[GitCommitRef] = js.native
  
  var refUpdates: js.Array[GitRefUpdate] = js.native
  
  var repository: GitRepository = js.native
}
object GitPush {
  
  @scala.inline
  def apply(
    _links: js.Any,
    commits: js.Array[GitCommitRef],
    date: js.Date,
    pushCorrelationId: String,
    pushId: Double,
    pushedBy: IdentityRef,
    refUpdates: js.Array[GitRefUpdate],
    repository: GitRepository,
    url: String
  ): GitPush = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pushCorrelationId = pushCorrelationId.asInstanceOf[js.Any], pushId = pushId.asInstanceOf[js.Any], pushedBy = pushedBy.asInstanceOf[js.Any], refUpdates = refUpdates.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPush]
  }
  
  @scala.inline
  implicit class GitPushMutableBuilder[Self <: GitPush] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommits(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: GitCommitRef*): Self = StObject.set(x, "commits", js.Array(value :_*))
    
    @scala.inline
    def setRefUpdates(value: js.Array[GitRefUpdate]): Self = StObject.set(x, "refUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUpdatesVarargs(value: GitRefUpdate*): Self = StObject.set(x, "refUpdates", js.Array(value :_*))
    
    @scala.inline
    def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
