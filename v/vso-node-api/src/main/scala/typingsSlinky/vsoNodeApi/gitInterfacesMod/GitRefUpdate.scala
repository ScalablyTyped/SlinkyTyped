package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRefUpdate extends StObject {
  
  var isLocked: Boolean = js.native
  
  var name: String = js.native
  
  var newObjectId: String = js.native
  
  var oldObjectId: String = js.native
  
  var repositoryId: String = js.native
}
object GitRefUpdate {
  
  @scala.inline
  def apply(isLocked: Boolean, name: String, newObjectId: String, oldObjectId: String, repositoryId: String): GitRefUpdate = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newObjectId = newObjectId.asInstanceOf[js.Any], oldObjectId = oldObjectId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRefUpdate]
  }
  
  @scala.inline
  implicit class GitRefUpdateMutableBuilder[Self <: GitRefUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObjectId(value: String): Self = StObject.set(x, "newObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldObjectId(value: String): Self = StObject.set(x, "oldObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
