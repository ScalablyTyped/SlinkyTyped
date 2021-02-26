package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitLastChangeTreeItems extends StObject {
  
  /**
    * The list of commits referenced by Items, if they were requested.
    */
  var commits: js.Array[GitCommitRef] = js.native
  
  /**
    * The last change of items.
    */
  var items: js.Array[GitLastChangeItem] = js.native
  
  /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
  var lastExploredTime: js.Date = js.native
}
object GitLastChangeTreeItems {
  
  @scala.inline
  def apply(commits: js.Array[GitCommitRef], items: js.Array[GitLastChangeItem], lastExploredTime: js.Date): GitLastChangeTreeItems = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastExploredTime = lastExploredTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeTreeItems]
  }
  
  @scala.inline
  implicit class GitLastChangeTreeItemsMutableBuilder[Self <: GitLastChangeTreeItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommits(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: GitCommitRef*): Self = StObject.set(x, "commits", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[GitLastChangeItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: GitLastChangeItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLastExploredTime(value: js.Date): Self = StObject.set(x, "lastExploredTime", value.asInstanceOf[js.Any])
  }
}
