package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a TryCreateFolderAsync operation. */
@js.native
trait EmailMailboxCreateFolderResult extends StObject {
  
  /** Get the newly created folder after a TryCreateFolderAsync operation. */
  var folder: EmailFolder = js.native
  
  /** Gets the status of a TryCreateFolderAsync operation. */
  var status: EmailMailboxCreateFolderStatus = js.native
}
object EmailMailboxCreateFolderResult {
  
  @scala.inline
  def apply(folder: EmailFolder, status: EmailMailboxCreateFolderStatus): EmailMailboxCreateFolderResult = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxCreateFolderResult]
  }
  
  @scala.inline
  implicit class EmailMailboxCreateFolderResultMutableBuilder[Self <: EmailMailboxCreateFolderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: EmailFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EmailMailboxCreateFolderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
