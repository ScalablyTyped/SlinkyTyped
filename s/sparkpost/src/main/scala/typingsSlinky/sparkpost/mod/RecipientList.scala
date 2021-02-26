package typingsSlinky.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientList extends StObject {
  
  /** Recipient list attribute object */
  var attributes: js.Any = js.native
  
  /** Detailed description of the recipient list */
  var description: String = js.native
  
  /** Short, unique, recipient list identifier */
  var id: String = js.native
  
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: String = js.native
  
  /** Number of accepted recipients */
  var total_accepted_recipients: Double = js.native
}
object RecipientList {
  
  @scala.inline
  def apply(
    attributes: js.Any,
    description: String,
    id: String,
    name: String,
    total_accepted_recipients: Double
  ): RecipientList = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientList]
  }
  
  @scala.inline
  implicit class RecipientListMutableBuilder[Self <: RecipientList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_accepted_recipients(value: Double): Self = StObject.set(x, "total_accepted_recipients", value.asInstanceOf[js.Any])
  }
}
