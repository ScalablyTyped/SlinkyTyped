package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFoldersChangeEvent extends StObject {
  
  /**
    * Added workspace folders.
    */
  val added: js.Array[WorkspaceFolder] = js.native
  
  /**
    * Removed workspace folders.
    */
  val removed: js.Array[WorkspaceFolder] = js.native
}
object WorkspaceFoldersChangeEvent {
  
  @scala.inline
  def apply(added: js.Array[WorkspaceFolder], removed: js.Array[WorkspaceFolder]): WorkspaceFoldersChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFoldersChangeEvent]
  }
  
  @scala.inline
  implicit class WorkspaceFoldersChangeEventMutableBuilder[Self <: WorkspaceFoldersChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[WorkspaceFolder]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: WorkspaceFolder*): Self = StObject.set(x, "removed", js.Array(value :_*))
  }
}
