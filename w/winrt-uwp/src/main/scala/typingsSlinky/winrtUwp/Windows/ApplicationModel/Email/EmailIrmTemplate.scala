package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a template that can be used to create new EmailIrmInfo objects. */
@js.native
trait EmailIrmTemplate extends StObject {
  
  /** Gets or sets the description of the template. */
  var description: String = js.native
  
  /** Gets or sets the ID for the template. */
  var id: String = js.native
  
  /** Gets or sets the name for the template. */
  var name: String = js.native
}
object EmailIrmTemplate {
  
  @scala.inline
  def apply(description: String, id: String, name: String): EmailIrmTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIrmTemplate]
  }
  
  @scala.inline
  implicit class EmailIrmTemplateMutableBuilder[Self <: EmailIrmTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
