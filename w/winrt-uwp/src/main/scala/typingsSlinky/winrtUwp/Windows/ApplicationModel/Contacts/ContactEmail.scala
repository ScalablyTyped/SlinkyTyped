package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email address of a contact. */
@js.native
trait ContactEmail extends StObject {
  
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  var address: String = js.native
  
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  
  /** Gets and sets the kind of email address of a contact. */
  var kind: ContactEmailKind = js.native
}
object ContactEmail {
  
  @scala.inline
  def apply(address: String, description: String, kind: ContactEmailKind): ContactEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactEmail]
  }
  
  @scala.inline
  implicit class ContactEmailMutableBuilder[Self <: ContactEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ContactEmailKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
