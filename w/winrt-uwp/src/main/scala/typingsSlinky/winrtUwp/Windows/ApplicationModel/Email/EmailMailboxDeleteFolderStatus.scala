package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxDeleteFolderStatus extends StObject
/** Indicates the result of a call to TryDeleteFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus")
@js.native
object EmailMailboxDeleteFolderStatus extends StObject {
  
  /** An error occurred while deleting parts of the folder. */
  @js.native
  sealed trait couldNotDeleteEverything extends EmailMailboxDeleteFolderStatus
  
  /** There was a network error while trying to delete the folder. */
  @js.native
  sealed trait networkError extends EmailMailboxDeleteFolderStatus
  
  /** There was a permissions error while trying to delete the folder. */
  @js.native
  sealed trait permissionsError extends EmailMailboxDeleteFolderStatus
  
  /** There was a server error while trying to delete the folder. */
  @js.native
  sealed trait serverError extends EmailMailboxDeleteFolderStatus
  
  /** The folder was successfully deleted. */
  @js.native
  sealed trait success extends EmailMailboxDeleteFolderStatus
  
  /** Folder deletion failed for an unknown reason. */
  @js.native
  sealed trait unknownFailure extends EmailMailboxDeleteFolderStatus
}
