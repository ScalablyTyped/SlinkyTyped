package typingsSlinky.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFolders extends StObject {
  
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.native
}
object WorkspaceFolders {
  
  @scala.inline
  def apply(): WorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolders]
  }
  
  @scala.inline
  implicit class WorkspaceFoldersMutableBuilder[Self <: WorkspaceFolders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkspaceFolders(value: Boolean): Self = StObject.set(x, "workspaceFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceFoldersUndefined: Self = StObject.set(x, "workspaceFolders", js.undefined)
  }
}
