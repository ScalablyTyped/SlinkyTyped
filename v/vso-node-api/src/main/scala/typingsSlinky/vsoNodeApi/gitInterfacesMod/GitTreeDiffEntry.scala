package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTreeDiffEntry extends StObject {
  
  /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
  var baseObjectId: String = js.native
  
  /**
    * Type of change that affected this entry.
    */
  var changeType: VersionControlChangeType = js.native
  
  /**
    * Object type of the tree entry. Blob, Tree or Commit("submodule")
    */
  var objectType: GitObjectType = js.native
  
  /**
    * Relative path in base and target trees.
    */
  var path: String = js.native
  
  /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
  var targetObjectId: String = js.native
}
object GitTreeDiffEntry {
  
  @scala.inline
  def apply(
    baseObjectId: String,
    changeType: VersionControlChangeType,
    objectType: GitObjectType,
    path: String,
    targetObjectId: String
  ): GitTreeDiffEntry = {
    val __obj = js.Dynamic.literal(baseObjectId = baseObjectId.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], targetObjectId = targetObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeDiffEntry]
  }
  
  @scala.inline
  implicit class GitTreeDiffEntryMutableBuilder[Self <: GitTreeDiffEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseObjectId(value: String): Self = StObject.set(x, "baseObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeType(value: VersionControlChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: GitObjectType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetObjectId(value: String): Self = StObject.set(x, "targetObjectId", value.asInstanceOf[js.Any])
  }
}
