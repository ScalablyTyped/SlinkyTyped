package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of Contact objects and server search status. */
@js.native
trait ContactBatch extends StObject {
  
  /** Gets the list of Contact objects returned by a search operation. */
  var contacts: IVectorView[Contact] = js.native
  
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  var status: ContactBatchStatus = js.native
}
object ContactBatch {
  
  @scala.inline
  def apply(contacts: IVectorView[Contact], status: ContactBatchStatus): ContactBatch = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactBatch]
  }
  
  @scala.inline
  implicit class ContactBatchMutableBuilder[Self <: ContactBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContacts(value: IVectorView[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ContactBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
