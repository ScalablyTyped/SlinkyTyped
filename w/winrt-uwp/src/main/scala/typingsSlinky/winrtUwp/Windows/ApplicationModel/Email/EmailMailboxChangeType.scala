package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxChangeType extends StObject
/** Defines the type of change made to the mailbox item. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangeType")
@js.native
object EmailMailboxChangeType extends StObject {
  
  /** Change unknown because change tracking was lost. */
  @js.native
  sealed trait changeTrackingLost extends EmailMailboxChangeType
  
  /** A folder was created. */
  @js.native
  sealed trait folderCreated extends EmailMailboxChangeType
  
  /** A folder was deleted. */
  @js.native
  sealed trait folderDeleted extends EmailMailboxChangeType
  
  /** A folder was modified. */
  @js.native
  sealed trait folderModified extends EmailMailboxChangeType
  
  /** A message was created. */
  @js.native
  sealed trait messageCreated extends EmailMailboxChangeType
  
  /** A message was deleted. */
  @js.native
  sealed trait messageDeleted extends EmailMailboxChangeType
  
  /** A message was modified. */
  @js.native
  sealed trait messageModified extends EmailMailboxChangeType
}
