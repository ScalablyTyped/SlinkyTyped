package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@js.native
trait EmailMailboxChange extends StObject {
  
  /** Gets the type of change that was made to the mailbox. This includes whether it was a folder or message that was changed and whether the item was created, deleted, or modified, or if change tracking was lost for this change. */
  var changeType: EmailMailboxChangeType = js.native
  
  /** Gets the folder to which the change applies. */
  var folder: EmailFolder = js.native
  
  /** Gets the flags that indicate what actions have been affected on the mailbox. */
  var mailboxActions: IVector[EmailMailboxAction] = js.native
  
  /** Gets the message to which the change applies. */
  var message: EmailMessage = js.native
}
object EmailMailboxChange {
  
  @scala.inline
  def apply(
    changeType: EmailMailboxChangeType,
    folder: EmailFolder,
    mailboxActions: IVector[EmailMailboxAction],
    message: EmailMessage
  ): EmailMailboxChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], mailboxActions = mailboxActions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxChange]
  }
  
  @scala.inline
  implicit class EmailMailboxChangeMutableBuilder[Self <: EmailMailboxChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: EmailMailboxChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: EmailFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailboxActions(value: IVector[EmailMailboxAction]): Self = StObject.set(x, "mailboxActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: EmailMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
