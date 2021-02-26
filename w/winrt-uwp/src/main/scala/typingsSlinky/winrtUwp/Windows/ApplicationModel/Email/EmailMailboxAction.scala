package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about a change that occurred to a mailbox. */
@js.native
trait EmailMailboxAction extends StObject {
  
  /** Gets the number that identifies the change that happened to the mailbox. */
  var changeNumber: Double = js.native
  
  /** Gets the value that represents the kind of change that happened to the mailbox. */
  var kind: EmailMailboxActionKind = js.native
}
object EmailMailboxAction {
  
  @scala.inline
  def apply(changeNumber: Double, kind: EmailMailboxActionKind): EmailMailboxAction = {
    val __obj = js.Dynamic.literal(changeNumber = changeNumber.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAction]
  }
  
  @scala.inline
  implicit class EmailMailboxActionMutableBuilder[Self <: EmailMailboxAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeNumber(value: Double): Self = StObject.set(x, "changeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: EmailMailboxActionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
